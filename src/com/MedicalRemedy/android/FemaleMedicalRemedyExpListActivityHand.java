package com.MedicalRemedy.android;


import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;

public class FemaleMedicalRemedyExpListActivityHand extends ExpandableListActivity
{
 /**
  * strings for group elements
  */
    static final String arrGroupelements[] = 
    {
    	"Allergies",
    	"Arthritis",
    	"Bruises",
    	"Burns",
    	"Eczema",
    	"Gout",
    	"Itching",
    	"Pains Remedies",
    	"Poisonous Bites",
    	"Psoriasis",
    	"Rheumatism",
    	"Skin",
    	"Warts",
    	"Wounds"
    };
 
    /**
     * strings for child elements
     */
    static final String arrChildelements[][] = 
    {
    	{
    		"1. Chandan (Sandalwood): 1 tbsp mixture of lime juice in sandalwood paste could be applied.",
    		"2. Five drops of Castor oil in half a cup of any fruit or vegetable juice, or plain water, and taken on an empty stomach in the morning, is beneficial for allergies of the intestinal tract, skin, and nasal passages.",
    		"3. Half a lime may be squeezed in a glass of lukewarm water and sweetened with a teaspoon of honey. It not only flushes the system of toxins but also acts as an anti-toxic and anti-allergic agent.",
    		"4. One or two bananas a day are useful for those who are allergic to certain foods and who consequently suffer from skin rashes, digestive disorders, or asthma, The fruit does, however, cause allergic reactions in certain sensitive persons and they should avoid it.",
    		"5. A quantity of 500 ml carrot juice or a combination of carrot juice with beet and cucumber juices, has been found beneficial in the treatment of allergies.",
    		"6. Butter bur is another name for petasites, it is proved that butter bur is effective in treating allergy symptoms.",
    		"7. Application of mashed almond leaves to the affected area is highly beneficial. This is one of the useful skin allergy cure.",
    		"8. Make a paste from five grams of garden mint in water. Sieve the water now add 12 grams of sugar, drink this syrup twice a day for immediate relief. This is a good home remedy for skin allergy.",
    		"9. Application of lemon juice mixed with coconut oil is also beneficial for skin allergy.",
    		"10.Drink a glass of water with two tablespoons of cider vinegar. This is a good natural remedy for skin allergy.",
    		"11.Make a paste from sandalwood and lime juice, apply on the affected area it will provide relief from itching.",
    		"12.Grind 1 tablespoon of poppy seeds with 1-teaspoon water and add 1-teaspoon lime juice. Apply to affected area for relief from itching and redness.It is proven effective.",
    		"13.Try to avoid the use of cosmetics.",
    		"14.Every part of neem can bee used for any skin allergies. Mostly leaves of Neem are made into paste to treat skin disorders and allergies."
    	},
    	
    	{
    		"1. Mixture of powders of 6 tsp each ginger, caraway seeds and 3 tsp black pepper could be taken in 1/2 tsp dosage along with water twice daily.",
    		"2. Massage gently with pure coconut oil daily before going to bed.",
    		"3. Wrap red flannel gently around painful joint and leave it overnight.",
    		"4. To get effective relief from Arthritis gently massage with warm olive oil.",
    		"5. For immediate relief dilute Garlic, Juniper, Lavender, Sage, Rosemary, Thyme, or Sassafras oils in the proportions of one part to 10 parts of olive oil and use it to massage the painful joints.",
    		"6. The arthritis patient must be given a lukewarm enema for a few days to cleanse the bowels, as the first step to prevent arthritis.",
    		"7. The nice home remedy for arthritis treatment are Steam baths and body massage.",
    		"8. Massage muscles and joints with Neem oil. It relieve pain from conditions arthritis."
    	},
    	
    	{
    		"1. Make 8 pills by mixing 25 gms of jaggery to fine paste made with Peepal tree leaves. Take this pill daily with milk to relive pain due to bruises."
    	},
    	
    	{
    		"1. Apply ink on burns will helps to get rid of swelling and burning sensation. Also helps to cure burns very soon.",
    		"2. putting cold water immediate on the burned area till the burning sensation reduces helps in reducing the effect of burn and prevents formation of blisters. Keep drinking water, milk, curd etc..",
    		"3. Applying Honey regularly on the burning helps to rescue Burning and heals faster and also removes burning scars.",
    		"4. Harad (Hartiki) powder mixed with Honey can be applied on the burns reduces burning and helps faster",
    		"5. Raw potato or potato pate applied on the burns helps to reducing burning and heals faster.",
    		"6. Turmeric paste applied on the burned wounds reduces burning and heels faster.",
    		"7. Applying Ghee on the burns helps to reducing burning and heals faster.",
    		"8. Mango leaves burnt and its ashes sprinkled on the burns heals fasters.",
    		"9. Mustard oil (Sarson ka teil) applied on the burns helps to avoid blisters.",
    		"10.Aloe Vera (Gwar patha) juice applied regularly on the burns hleps to reduces burning, faster healing and removing scars.",
    		"11.Sesame seeds (Til) grinder sand applied as a thick paste on the burns heals faster and reduces burning.",
    		"12.Applying thick paste of sugar on the burning helps to reduces burning.",
    		"13.Banana pulp applied on the burns helps to reduce burning sensation.",
    		"14.Carrot grinded and its paste applied on the burns helps to reduces burning sensation.",
    		"15.Applying thick paste of Fenugreek seeds (Menthi) on the burns helps to reduce burning and prevents blister formation.",
    		"16.Applying Glycerin on the burns reduces burning.",
    		"17.Neem water heals the burn injuries, and there by protects them from infecting further.",
    		"18.Mix tamarind leaves with gingili oil and apply it all over the burns part.Application of this oil keeps the wound way from the moisture and germs.",
    		"19.Neem water is very effective when used to treat injuries caused due to burns. It heals up skin fast and prevents the creation of any kind of an allergy or infection."
    	},
    	
    	{
    		"1. A light mudpack applied over the place of eczema is very beneficiary.",
    		"2. Apply the fine paste of 1 tsp camphor and 1-teaspoon sandalwood on the affected eczema areas.",
    		"3. The effective remedy for Eczema is to make a fine paste by adding 1 tbls of turmeric powder and 1 tbls of bitter neem leaves and applying this paste on affected areas.",
    		"4. Apply spearmint leaf juice to Eczema affected areas. It proved beneficiary.",
    		"5. Mash almond leaves in water and apply on the area, it will also help in the eczema treatment.",
    		"6. Papaya seeds mashed and applied on areas prevent itching of the skin suffering from eczema.",
    		"7. Boil 25 grams of Neem Tree bark and mango bark in one liter of water. Allow the vapor to foment the affected part. After the fomentation, the affected part should be anointed with ghee.",
    		"8. An effective Eczema home remedy is called when you add an equal quantity of carrot juice and spinach juice and apply it on the affected eczema area.",
    		"9. Apply the paste of nutmeg slowly rubbing it on smooth stone with little water.",
    		"10.Pour 2 cups of colloidal oatmeal into a tub of lukewarm water and bath with this water properly.",
    		"11.Boil 25 grams of Babul Tree bark and mango bark in onw liter of water. Allow the vapor to foment the affected part. After the fomentation, the affected part should be anointed with ghee."
    	},
    	
    	{
    		"1. Make an ash by torching the “Indian Reed – Mace” leaves and mix this ash with sesame seed oil. Applying of this solution on gout effected area helps give relief and also helps to cure gout.",
    		"2. As there is a saying that an apple a day keeps the doctor away. We can trust apple to keep also the Gout away. A person with gout complaints must eat at least one apple per day for obtaining relief.",
    		"3. Drinking 6-8 ounces glasses of fluid a day not only reduces gout attacks a day but also wash out the urate crystals from the system and prevent you from developing kidney stones.",
    		"4. Drink the half cup juice of French beans everyday for a month once or twice.",
    		"5. Bananas are a good home remedy for curing Gout. Consume 3-4 bananas a day.",
    		"6. One of the important home remedies to treat Gout is to soak a piece of white flannel cloth in warm castor oil and place it over the affected areas.",
    		"7. Boil one tea-spoon of pepper in one cup of vinegar and one cup of water, dab this mixture onto the painful joint and leave it for 2-3 hours.",
    		"8. Mince the garlic and add it to black cherry juice for better effects. This remedy works very well if you have the garlic cherry paste in the early morning.",
    		"9. Massage muscles and joints with Neem oil. It relieves pain from gout."
    	},
    	
    	{
    		"1. Drinking one tablespoon of hot pure Ghee in one go, empty stomach in the morning, for few days to cure itching problem. Ghee should be hot enough but bearable.",
    		"2. Boil neem leaves in sufficient water for 10-15 minutes. Taking bath with this water helps in curing many skin diseases including Itching.",
    		"3. Durva (Dub, A grass and used to worship Lord Ganesh) juice mixed with Turmeric powder applied on the affected area cures Itching.",
    		"4. Bottle gourd (Ghee) juice applied on the affected area cures Itching.",
    		"5. Boil some Coriander (Dhania) seeds in water and add Sugar and filter. Drinking this decoction helps to reduce Pitt and Itching.",
    		"6. Drinking Mint (pudina) juice and applying Mint juice on the body also cures Itching.",
    		"7. Applying the paste of grinded Tender Guava leaves and Curd, on the body 2 hours before taking bath helps to cure Itching.",
    		"8. Eating raw Cabbage (patta gobi) everyday helps to cure Itching.",
    		"9. Boil some Cumin seeds (Jeera) in water and taking bath with this water helps to cure Itching.",
    		"10.Applying Milk on the body before taking bath also helps to get rid of Itching problems.",
    		"11.Banana pulp meshed with Lemon Juice applied on the affected area helps to cure Itching.",
    		"12.Drinking few drops of Neem juice or applying Neem oil on the affected area helps to cure Itching.",
    		"13.Basil (Tulsi) juice mixed with Lemon juice applied on the affected area helps to cure Itching.",
    		"14.Nix two spoons of Coconut oil with one spoon to Tomato juice, this oil can be applied on the body before taking bath (with warm water ) reduces Itching.",
    		"15.Taking 10 whole Black peppers (kali mirch) powder with a spoon of Ghee, twice a day for few days cures Itching.",
    		"16.Harad (Haritaki) powder boiled in water to form a paste, this paste applied on the body with the help of a cloth cures Itching.",
    		"17.Garlic cloves boiled in any type of oil (used for body message), this oil applied on the affected area reduces Itching.",
    		"18.Pigeon pea (Arhar dal) grinded and mixed with Curd, applied on the body reduces Itching.",
    		"19.Coconut oil mixed with small quantity of Lemon juice, applied on the affected area helps to reduce Itching.",
    		"20.Eating boiled White goose foot (Bathua) leaves for few days or washing affected area with its juice, reduces Itching.",
    		"21.Mix around 10 grams or camphor (Karpoor) mixed with 100 grams of Coconut oil. This oil applied on the body reduces Itching.",
    		"22.Green gram (Moong) paste applied on the affected area cures Itching.",
    		"23.Grinded carom (Ajwain) leaves applied on the day, half an hour before taking both helps to cure Itching.",
    		"24.Drink milk mixed with grinded Carom (Ajwain) leaves and Sugar, which helps to cure Itching.",
    		"25.Apply neem oil to the affected area. Or make a fresh paste of some neem leaves and apply externally. Boil neem leaves in the hot water used for your bath. Also eat a teaspoon of neem juice along with sugar for quick relief.",
    		"26.Smearing a paste of tamarind pulp over the affected parts provides instant relief."
    	},
    	
    	{
    		"1. For pains in the legs and hands: Heat the camphor with some good oil and applying this mixture on the pains in the legs and hands will give instant relief from pains. This is a very good home remedy for pain at home. Give a light massage with coconut oil before going to sleep will give pain relief in the morning. Take a hot water and dip the plain cloth in it. Now giving some pressure with this hot cloth will give instant relief from pains in the joints, legs and hands.",
    		"2. For pains in the joints or knees: Heat the human urine and wetting leg fingers with this portion will give relief from pains. Tieing the bone of dead human being to the leg fingers of who have pains in feet will cure pains. Collect the oil by cooking the bat's meat. Applying this oil helps to cure pains in the joints and waist. Give a light massage with castor oil and tieing the knee pains area with heated castor oil tree leaves with a cloth will cure knee pains. Applying the paste made with the help of tobacco",
    		"3. For pains from cold or atrabilis:Make a fine form of paste by rubbing the tobacco on floor and applying this paste on pains will cure pains from cold or atrabilis. Massaging with fat of the wild hog on pain area will cure pains from cold or atrabilis. Make a paste with roots of drumstick tree and mustard seeds. Tieing with a plain cloth with paste on pain area will cure pains from cold or atrabilis. Massaging with sand oil will cure pains. Tieing with Machi Patri will remove pains from cold or atrabilis. Drinking of 50 to 60 grams of decoction made from Parijatham leaves will cure pains.",
    		"4. Colic or Stomach Pain:Taking 12 to 20 drops of oil made from lemon grass will cure stomach pain, which is oftenly giving pain in the stomach. Taking of Indian plant Sampenga tree leaves juice with honey will give instant relief from colic or stomach pain. Make a scratch with a knife to the papaya, you will get some milk. Taking this milk by mixing of some water will cure stoamch pain immediately. NOTE: Pregnant women should not use this home remedy as the drinking of papaya milk may result abortion.",
    		"5. For Pain in the shoulder blade: Heat the Indian red wood (which have black flowers) tree leaves in castor oil and tieing these leaves on pain area will cure pain in the shoulder blade."
    	},
    	
    	{
    		"1. Applying lemon juice mixed with salt on the affected area helps in reducing the effect of poisonous bite.",
    		"2. Applying Onion juice mixed with honey on the affected area helps in reducing the effect of poisonous bit.",
    		"3. Applying garlic paste on the affected area helps in removing the poisonous effect of a poisonous bite.",
    		"4. Pomegranate (Anar) leaves grinded and its juice applied on the affected area helps in reducing the effect of poisonous bite.",
    		"5. Applying Asafoetida (Hing) paste on the affected area helps in reducing the effect of poisonous bite.",
    		"6. Applying Neem leaf juice on the affected area helps in reducing the effect of poisonous bite.",
    		"7. Applying Mint juice on the affected area helps in reducing the effect of poisonous bite.",
    		"8. Ash gourd (Petha) stalk grinded with sandal wood and this paste applied on the affected area helps in reducing the effect of poisonous bite."
    	},
    	
    	{
    		"1. Drink one bowl of Cabbage soup everyday. It is an effective home remedy for Psoriasis.",
    		"2. To cure Psoriasis cover a fresh thin banana leaf on the affected part.",
    		"3. Apply the diluted solution of lime juice with water externally on the psoriasis patches.",
    		"4. Buttermilk has proved useful in psoriasis and the patient should drink it in liberal quantities.",
    		"5. Mix a cup of freshly prepared bitter gourd juice with a tsp of limejuice. Drink this mixture every day, on an empty stomach, for 4 to 5 days.",
    		"6. Hot Epsom salt bath is used to treat psoriasis. Apply olive oil after the Epsom salt bath. It will prove beneficial in curing psoriasis.",
    		"7. Take powdered Fuller's earth and add enough water to form a paste. Apply this paste on the affected area, let it dry and rinse off. It will help remove toxins from your skin. Its proved beneficiary in curing Psoriasis.",
    		"8. Mix Aloe Vera gel and garlic oil in equal proportions. Apply on the affected area. This is a good home remedy to cure psoriasis.",
    		"9. Neem tree has anti-bacterial properties in itself. Use its leaves or bark as it will help in fighting against psoriasis."
    	},
    	
    	{
    		"1. Use the latex of Banyan tree. It is proved effective for Rheumatism.",
    		"2. use the milky juice from the banyan tree to massage the joints as it relieves swelling and rheumatic pain."
    	},
    	
    	{
    		"1. Use natural home made herbal bath powder for bath. Which will helps to get rid of skin problems and helps to maintain good skin.",
    		"2. Daily applying the paste made from outer bark of apple tree on skin can helps to clear all types of skin problems in very short span of time.",
    		"3. Use clean and dry towel to every bath, it will prevents skin related problems or skin diseases.",
    		"4. For complete skin protection make a strong tea with neem leaves and add to the bath along with a little rose water."
    	},
    	
    	{
    		"1. Apply Castor oil (Erand) over the affected parts or Warts every night. The treatment should be continued for several months to get rid of warts.",
    		"2. Cashew nut oil is useful in removing warts. As it is a strong irritant to the skin, it should be applied externally over the affected areas.",
    		"3. onions are irritating the the skin and stimulate the circulation of the blood. Warts sometimes disappear when rubbed with cut onions for few days.",
    		"4. Raw potatoes are useful for treating warts. They should be cut and rubbed on the affected area several times daily, for at least two weeks.",
    		"5. Milky juice of a fresh Fig (Anjeer) applied on the warts for two weeks helps to get rid of them.",
    		"6. Raw papaya (papita) Juice or pineapple juice applied on the warts helps to get rid of them.",
    		"7. Applying Lemon juice on the warts also helps to get rid of them. Covering the wart with a cotton dipped in lemon juice continuously for some days, helps in smoothing and getting rid of warts.",
    		"8. Mix baking soda with Castor oil and rub it on the wart and cover it with a bandage. Repeat this every day. In a week or two, the wart will swell and turn red. Keep repeating the application of the mixture till the wart fall off.",
    		"9. Applying sour tasted Apple juice on warts for some days helps to get rid of warts from the root itself.",
    		"10.Take a thin slice of fresh Garlic, large enough to cover the wart. Place it directly on wart and hold it with a plastic bandage. Remove bandage and garlic next day after bathing. A little blister will appear. Allow blister to be subside and dry away. Wart will fall in two weeks.",
    		"11.Eating raw Cabbage (Patta gobi) regularly for some days helps to get rid of warts.",
    		"12.Applying Coriander paste (Dhania) on the warts helps to get rid of warts.",
    		"13.Rubbing a fresh aloe Vera (Gwar Patha) leaf on the warts for few days, helps to get rid of them.",
    		"14.Treat Warts with Neem leaves, as they are the best remedy. Directly apply the paste made by Neem leaves on the warts affected area."
    	},
    	
    	{
    		"1. Collect an ash from torching the Indian Reed – Mace (Jammu) leaves. Spray this ash on septic wounds will helps to cure septic wounds very fast.",
    		"2. Applying Neem oil on any type of wounds cures the wound very fast. Neem oil is one of the best home remedy to heal wounds fast.",
    		"3. Applying milk of Ficus Lacor (juvvi chettu) on wounds will cure very effectively.",
    		"4. Wounds washing with decoction made from Ficus Lacor (juvvi chettu) bark can helps to heal wounds fast.",
    		"5. Sesame seeds(Til) and Neem leaves roasted with Castor oil (Erand) and grinded Turmeric and little Camphor,can be used as an home made ointment.Daily use of this ointment cures wound faster.",
    		"6. Eating oranges,garlic,grapes,carrots helps to heal the wounds faster.",
    		"7. Applying honey on the wounds,helps to heal the wound faster and also removes its scar.",
    		"8. Boils carrot pulp (after cooling) applied on the wounds help to heal the wound faster.",
    		"9. Grinded Basil leaves (Tulsi) applied on the wounds,heals the wound faster.Water boiled with Basil leaves can be used to wash wounds which helps to kill germs and prevent infection.",
    		"10.Applying Turmeric paste on the wounds and drinking Turmeric with milk,helps to heals the wound faster and helps to kill germs and prevent infection",
    		"11.Potato boiled in water and this water used to wash the internal wounds reduces swelling and pain.",
    		"12.washing wounds with own Urine,helps to heals the wound faster and helps to kill germs and prevent.",
    		"13.Applying sandal wood paste in the wounds helps to heal the wound faster.",
    		"14.Applying juice oozed from a cut on raw Banana, on the wounds helps to heal the injury faster.",
    		"15.Applying juice.oozed from a cut on raw Papaya (Papita). on the wounds helps to heal injury faster.",
    		"16.Garlic juice and Turmeric mixed Gingery (Til)oil applied on the swelling helps to reduce swelling and heals wounds faster.",
    		"17.Applying the paste of carom seeds (Ajwain) grinded with Lemon juice on the swelling,caused by a wounds,helps to cure the wound faster and reduces pain.",
    		"18.Tamarind (Imli) pulp heated and applied on the swollen area (internal injury), helps to cure the wounds faster and reduces pain.",
    		"19.The swelling caused due to wound can be heated, with the help of hot Drun stick ( Muranka bhaji ) leaves tied in a cloth. This will reduce the swelling and pain.",
    		"20.Tie grinded Mint (Pudina) in a cloth and apply over the wounds, it helps to heal the wound faster and helps to kill germs and prevent infection.",
    		"21.Applying raw Potato paste on the internal blood clot ( Neel, Blue, Color),due to a internal injury, is helpful in reducing the pain.",
    		"22.Boil Camphor (Karpuram) in coconut oil and apply this oil over the swollen area. Wash the Swollen area with hot water nest day. This helps to reduce swelling caused by internal injury.",
    		"23.Apply latex of Banyan Tree on wounds. It is the most simplest way to heal your wounds."
    	}
    };
    
    ExpandableListView expList;
  
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.medical_remedy_main);

        expList = getExpandableListView();
        expList.setAdapter(new FemaleMedicalRemedyExpAdapterHand(this));
        
        expList.setOnGroupExpandListener(new OnGroupExpandListener()
        {
        	
        	public void onGroupExpand(int groupPosition) 
        	{
        		Log.e("onGroupExpand", "OK"+groupPosition);
        	}
        });
        expList.setOnGroupCollapseListener(new OnGroupCollapseListener()
        {
        	public void onGroupCollapse(int groupPosition) 
        	{
        		Log.e("onGroupCollapse", "OK"+groupPosition);
        	}
        });
   
        expList.setOnChildClickListener(new OnChildClickListener()
        {
        	public boolean onChildClick(ExpandableListView parent, View v,int groupPosition, int childPosition, long id) 
        	{
        		// TODO Auto-generated method stub
        		Log.e("OnChildClickListener", "OK");
        		TextView tvchild=(TextView) v.findViewById(R.id.tvPlayerName);
        		Log.e("OnChildClickListener", tvchild.getText().toString());
        		Intent in = new Intent("com.MedicalRemedy.android.DISP");
        		in.putExtra("title", arrGroupelements[groupPosition]);
        		in.putExtra("text", arrChildelements[groupPosition][childPosition]);
        		startActivity(in);
        		return false;
        	}
        });
    }  
    
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	menu.add("Search for home remedies").setOnMenuItemClickListener(new OnMenuItemClickListener() {

			public boolean onMenuItemClick(MenuItem item) {
				Intent i = new Intent("com.MedicalRemedy.android.SEARCH");
				startActivity(i);
				return true;
			}
		});
    	return true;
    }
}