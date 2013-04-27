package com.MedicalRemedy.android;


import java.util.ArrayList;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;

public class AllDataActivity extends ExpandableListActivity
{
 /**
  * strings for group elements
  */
	static String arrChildelements[][] = new String[105][];
	static ArrayList <String> arrGroupelements = new ArrayList<String>();
    static String arrGroupelement[] = 
    {
    	"Acid Reflux",
    	"Acidity",
    	"Acne/Pimples",
    	"Allergies",
    	"Anemia",
    	"Anxiety",
    	"Arthritis",
    	"Asthama",
    	"Back Pain",
    	"Bad Body Odour",
    	"Bad Breath",
    	"Baldness",
    	"Bed Wetting / Enuresis",
    	"Body Care",
    	"Bronchitis",
    	"Bruises",
    	"Burning Urine / Dysuria",
    	"Burns",
    	"Cancer",
    	"Chicken Pox",
    	"Cholera",
    	"Cholesterol",
    	"Cold / Running Nose",
    	"Conjunctivitis",
    	"Constipation",
    	"Cough",
    	"Dandruff",
    	"Depression",
    	"Diabetes",
    	"Diarrhea",
    	"Dizziness",
    	"Dry and Chapped Lips",
    	"Dry Cough",
    	"Ears",
    	"Eczema",
    	"Erectile Dysfunction",
    	"Excessive Sweating",
    	"Eyes",
    	"Fever",
    	"Flu",
    	"Gas / Flatulence",
    	"Gout",
    	"Grey Hair",
    	"Hair Fall",
    	"Hair Loss",
    	"Head Ache",
    	"Head Lice",
    	"Healing",
    	"Healthy Hair",
    	"Heart Attack",
    	"Heartburn",
    	"Hemorrhoid",
    	"Herpes",
    	"Hiccough",
    	"High Blood Pressure",
    	"Improve Appetite",
    	"Increase Breast Milk",
    	"Increase Memory Power",
    	"Increase Resistance Power",
    	"Increase Weight",
    	"Indigestion",
    	"Insomnia",
    	"Irritable Bowel Syndrome",
    	"Itching",
    	"Jaundice",
    	"Leucorrhoea",
    	"Loose Motion",
    	"Low Blood Pressure",
    	"Malaria",
    	"Menstrual Stomach Ache",
    	"Migraine",
    	"Mouth Ulcer",
    	"Mumps",
    	"Natural Hair Loss",
    	"Nose Bleeding",
    	"Obesity / Overweight",
    	"Pains Remedies",
    	"Piles",
    	"Pneumonia",
    	"Poisonous Bites",
    	"Prickly Heat",
    	"Psoriasis",
    	"Pyorrhea",
    	"Rheumatism",
    	"Scorpion Bite",
    	"Shingles",
    	"Sinus Infection",
    	"Skin",
    	"Snake Bite",
    	"Stammering",
    	"Stretch Marks",
    	"Syphilis",
    	"Teeth Whitening",
    	"Tired Eyes",
    	"Tongue Cuts",
    	"Tonsillitis",
    	"Tooth Ache",
    	"Typhoid",
    	"Vomiting",
    	"Warts",
    	"Weight loss",
    	"Worms",
    	"Wounds",
    	"Wrinkles",
    	"Yeast Infections",
    	"end"
    };
 
    /**
     * strings for child elements
     */
    static String arrChildelement[][] = 
    {
    	{
    		"1. Suck Clove and cardamom as it relieves from Acidity or Acid Reflux.",
    		"2. In take cold milk helps in relieving from burning caused by acid.",
    		"3. Consume 10grams of jaggery or mishri (refined sugar). It helps in curbing the acid reflux.",
    		"4. Water is a good neutralizer for acid. Drink water in the early morning it controls acidity.",
    		"5. Drink cabbage juice daily as it prevents Acid Reflux.",
    		"6. The best acid reflux treatment is to have 1-2 tablespoons of white vinegar.",
    		"7. Taking a mixture of two teaspoons of apple cider vinegar and two teaspoons of honey in a glass of water before meals.",
    		"8. Consumption of milk and milk products is beneficial during acidity.",
    		"9. Consumption of fresh apple cider vinegar with honey in a glass of water before meals reduces the Acid Reflux.",
    		"10.Boil cumin seeds in a glass of water and drink it with meals.",
    		"11.Consume the extract of ginger root in order to ameliorate the ailment.",
    		"12.Drink a glass of water with a teaspoon of soda. It is beneficial and is good home remedy for acid reflux."
    	},
    	
    	{
    		"1. Drink as much butter milk as you can for 2 days, your acidity cures easily. This is an very beneficial homemade home remedy for acidity.",
    		"2. Daily eat curd rice at least once in a day keeps away from acidity.",
    		"3. Drink one glass of ragi (finger millet) java before going to work daily will get rid of acidity forever.",
    		"4. For instant acidity relief drink one glass of Lassi.",
    		"5. When you have more acidity, drink 1-2 liters of Luke warm water with a pinch of salt at a time in the morning empty stomach and try to vomit as much as possible. AT the the end you feel sourness in the mouth which means you are throwing away the acid. Or you can just drink a glass of water just before brushing and try to take it out just after brushing.",
    		"6. Putting a wet cloth (Approximately 8\" x 4\") on the stomach covering naval for a couple of hours gives relief from acidity.",
    		"7. Drinking half glass of cold milk gives a cooling effect and gives instant relief from acidity.",
    		"8. Mint (Pudina) Juice is also a good medicine for acidity.",
    		"9. Tender coconut water taken empty stomach gives cooling effect and relives acidity. Daily use of tender coconut water (2-3) for few months can give permanent relief from acidity and other stomach related problems.",
    		"10.Eating a plain ice-cream (Not a flavored ot colored) like vanilla gives instant relief from acidity.",
    		"11.Drinking falsa (Grewiab subinaequalis) juice or eating falsa is a best remedy to overcome acidity and improve digestion.",
    		"12.Eating one clove (Laung) after every meals helps to get relief from acidity.",
    		"13.Drinking ash gourd (peths) juice in empty stomach gives relief from hyper acidity and cures ulcer.",
    		"14.Banana makes a good coating on the layers inside the stomach and is a best remedy for curing acidity.",
    		"15.Indian Gooseberry (Amla) taken with equal amount of sugar candy (Mishri) is also a good remedy for acidity.",
    		"16.Potato contains potassium salt which reduces acid. Eating boiled potato helps to get rid of acidity.",
    		"17.eating cucumber, watermelon, banana helps to get rid of acidity.",
    		"18.Sucking a piece of jaggery (Gur) or Raisin (Kishmish) gives instant relief from acidity.",
    		"19.Taking some basil leaves (Tulsi) in the morning helps to overcome acidity.",
    		"20.Lemon juice with hot water taken an hour before meals helps to overcome acidity. Lemon contains potassium which reduces acid and helps for easy digestion.",
    		"21.Having a white onion with curs at least for a week cures acidity.",
    		"22.Cumin seeds (Jeera), coriander (Dhania), Sugar candy (Mishri) in equal quantities powdered and taken 2 spoons twice a day helps to cure acidity.",
    		"23.Half spoon of black pepper (kali mirch) powder taken with rock salt twice a day helps to get relief from acidity.",
    		"24.Sitting 5 minutes in vajrasan after every meals helps to get relief from acidity.",
    		"25.Eating a harad (Haritaki, Terminalia chebula) regularly helps to overcome acidity.",
    		"26.One spoon of grinded carom (ajwain) seeds mixed with a spoon of lemon juice taken with a glass of water gives relief from acidity.",
    		"27.Drinking Carrot juice or eating raw carrot regularly helps to overcome acidity.",
    		"28.Drinking bael juice regularly gives cooling effect and reduces acidity.",
    		"29.Eating banana with a pinch of cardamom (Elaichi) powder gives relief from acidity.",
    		"30.Ingest Neem in many ways. It is proven to eliminate the problem of Acidity."
    	},   
    	
    	{
    		"1. Yellow Indian cucumber (dosakaya) juice apply on the face helps to remove acne and remove its scars.",
    		"2. Take one apple and grated the apple and add 1 spoon of honey and mix well. Apply to the face, leave it 15 minutes and wash with luke warm water. It helps to remove acne or pimples.",
    		"3. Take 2 spoons of oat meal, small amount of honey, water and mix well. Apply to the face. After some time it will be tighten and remove with light hot water with one smooth cloth. it helps to control the acne.",
    		"4. Take 1 spoon pineapple juice with 1 pinch turmeric powder and mix well and apply to the face. Leave it 15 minutes and wash with cool water, it removes acne and black spots.",
    		"5. Take some curd, add 1 spoon oats, 4 drops lemon juice and mix well. Apply to the face. After some time remove the mask with cool water, it removes acne.",
    		"6. Once in every 3 days apply honey to the face and leave it 30 minutes. When you remove the mask with luke warm water, It removes acne.",
    		"7. Take mint juice with 1 pinch turmeric powder and apply to face, It removes acne and the block spots.",
    		"8. Take rose water, mix with 4 drops of lemon juice and mix well. Take some cotton and make a small round balls and dip in to the juice. Pace the balls over the spots and remove after 15 minutes. It removes acne scars.",
    		"9. Take almond (badham) powder and mix with castor oil and apply to face and then massage it. Leave it some time and then wash with luke warm water. It helps to control the pimples and helps to skin glow.",
    		"10.Take 2 spoons of water and mix with 1 spoon of olive oil and mix well, then apply to face, leave it some time. It is good for acne control and skin glow.",
    		"11.Take keera juice and mix with honey and stored in fridge, It will store up to 1 week, then apply paste to face with cotton. It helps to skin health and control acne.",
    		"12.Take 1/4 spoon honey and 1 table spoon face wash, small amount of glycerine and mix well, then apply the paste to face and leave it some time. Then clean with luke warm water, it helps to remove acne and dead skin.",
    		"13.Take white fluid in the egg and mix with honey and apply to face as a mask and leave it some time, then wash the face with light hot water. It removes acne and it is also good for skin tightening.",
    		"14.Take 1 table spoon of ground nut oil with 1 tbsp lime juice, then apply to face. It is good for prevent to formation of pimples.",
    		"15.Toothpaste removes Acne",
    		"16.Some times pimples have itching, that time to prevent for itching use this tip. Take toothpaste or calamine lotion and apply over the pimple and leave it some hours. It dried the pimple.",
    		"17.Take some pods of cloves and then fry them without oil and make a fine form of powder, then add curd and make a paste. Applying over the pimples helps to dry the pimples.",
    		"18.Applying papaya milk on face helps to remove acne or pimples.",
    		"19.Make a fine form of paste of Saunf and then add lemon juice to it. Applying of this mixture to the face daily helps to remove acne or pimples. Your face will glow naturally. This is very useful homemade home remedy for acne or pimples.",
    		"20.Sandalwood paste applied on the face helps to overcome Acne and remove its scars.",
    		"21.Cucumber (Kheera) juice mixed with lemon juice applied on the pimples helps to get relief from acne and acne scars.",
    		"22.Acne treatment using Pudina",
    		"23.Mint (Pudina) juice applied on the face also helps to get relief from acne and acne scars.",
    		"24.Water boiled with neem leaves used for taking steam helps in reducing acne and acne Scars.",
    		"25.Gram Flour (Besan) mixed with butter milk applied on the face reduces acne and acne scars.",
    		"26.Raw Papaya (papita) paste applied on the face helps to cure acne.",
    		"27.Nutmeg (Joy Phal) grinded with milk applied on the face helps a lot in reducing acne and acne scars. So nutmeg and milk cure acne very fast.",
    		"28.Powdered dry orange skin applied as a paste or orange skin rubbed on the face helps to remove acne scars.",
    		"29.Water boiled with neem leaves used for washing face removes extra oil from the face and reduces pimple or acne scar on face.",
    		"30.Tomato rubbed on the face or tomato juice applied on the face helps to remove acne scars.",
    		"31.Aloe vera (Gwar Patha) is a best medicine for pimples or acne. Aloe vera leaf rubbed on the face removes acne and acne scars.",
    		"32.Carom seeds (Ajwain) grinded with curd applied on the face also helps to get rid of acne or pimples.",
    		"33.Fenugreek (Menthi) paste also helps in getting rid of acne and its scars.",
    		"34.Basil Leaves (Tulsi) rubbed on the face helps to remove acne scars.",
    		"35.Lemon juice applied on the pimples also helps to remove acne and its scars.",
    		"36.Coriander (Dhania) juice mixed with lemon juice applied on the face also removes acne and its scars.",
    		"37.Neem powder or oil is very effective in relieving us from acne."
    	},
    	
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
    		"1. Eat lot of green vegetables especially leafy vegetabiles like Spinach (palak) Fenugreek (Menthi) Carrot Amaranth )Red Cholayi) and Beetroot which are rich in folic acid.Go for citrus fruits like Orange,Sweet lime (Mosambi) which are rich in vitamin C.",
    		"2. Honey is a excellent medicine to cure Anemia.Eating a spoon of Honey or taking Honey with milk twice a day will increase hemoglobin level as well as purify the blood.",
    		"3. Dates (Khajur) or Dry Dates (chuara) are very helpful in increasing blood level and curing Anemia.",
    		"4. Eating Almonds (Badam) everyday also helps to increase bloods and curing Anemia.",
    		"5. As jaggery (Gur) is a good source of iron consume it more instead of sugar which definitely cures Anemia.",
    		"6. Eating a Gooseberry (Amla)everyday also helps in improving in blood and curing Anemia as it is a good source of vitamin C> Also taking 3 spoons of Gooseberry juice with 3 spoons of pure Ghee for 21 days will definitely cures Anemia.",
    		"7. Taking Beet root juice or raw Beet root is a excellent medicine for curing Anemia.",
    		"8. Spinach ( palak) juice to Tomato juice taken everyday also helps in improving blood level and curing Anemia.",
    		"9. Drinking Lemon water with Honey everyday also helps in improving blood level and curing Anemia.",
    		"10.Eating a raw Onion or drinking raw onion juice everyday helps to cure Anemia.",
    		"11.Taking 5 milliliter of Ginger juice with old Jaggery (Gur) everyday morning helps to cure Anemia.",
    		"12.Pure cows Buttermilk mixed with sugar Candy (mishri) taken 3-4 times a day helps to cure Anemia problem.",
    		"13.250 milliliters of cow milk mixed with 10 gram of pure Ghee, 1 gram of Sugar, 5 gram of Honey, a pinch of Longer pepper (Pipple) and a pinch of Black pepper (Kali mirchi) taken everday for 2-3 weeks will definitely cure Anemia.",
    		"14.Amirita (Gloy or Tinospora) stem chopped taken 20 gram, Black pepper 10 gram, Garlic 5 gram grinded together and taken around 3 gram with milk everyday morning cures",
    		"15.Drinking Buttermilk (Chaach) made form goats milk for some days also helps to cure Anemia.",
    		"16.Drinking Apple juice everyday for eating a Apple (which is a natural source of iron) everday helps in curing Anemia.",
    		"17.Drinking Falsa (Grewiab subinaequalis) juice or eating falsa fruit is also a good remedy for curing Anemia.",
    		"18.Soya been ,Ragi are also said to be very good for Anemia patients if taken in any form.",
    	},
    	
    	{
    		"1. Drink milk mixed with three grams of Ashwagandha two times a day can helps to Cure Anxiety.",
    		"2. 1 tsp dried amla powder could be soaked in one cup of water overnight to which 1/8 tsp of black pepper powder and 2 tsp of lime juice added. The mixture is diluted as required for consumption.",
    		"3. Make a mixture of Liquorice (Atimadhuram), Verbanaceae (Saraswati Leaf ) and Amla (Usirika Varugu) same quantities. By taking 3 grams of this mixture with water or honey three times a day can helps in curing anxiety."
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
    		"1. Vitamin E is essential for Asthma patients so go for Sprouted wheat, Soya been, Coconut, tomato, grapes, dry furits etc.",
    		"2. Calcium is also essential for Asthma patents, take milk, Spinach ( Palak), Amaranth (Cholayi). Carrot Gooseberry (Amla), paneer Arrow root (Paniphal or Singhada) etc.",
    		"3. Two Figs (Anjeer) dipped overnight and taken in the morning for few days helps to cure Asthma.",
    		"4. Fenugreek (Menthi) and Carom seeds (Ajwain) boiled in water filtered and this decoction mixed with Honey taken thrice a day reguilary cure Asthma.",
    		"5. In one Betel leaf (Pan) put 5 Basil (Tulsi) leaves, one Clove, Pinch of Camphor (Karpoor) and fold it. Eat this everyday to cure Asthma.",
    		"6. Dry Dates (Chuara) and Dates (Khajur) both gives strength to lungs which is beneficial for curing Asthma.",
    		"7. In one cup of hot water mix one spoon of lemon juice, two spoons of Honey and a spoon of Ginger juice. Drinking this daily helps to cure Asthma.",
    		"8. Garlic juice mixed with Honey or Garlic juice with hot water can be taken everyday is very good for Asthma patients.",
    		"9. One Ounce of Brahmi (Gotu kola) juice taken in the morning for 21 days cure Asthma.",
    		"10.Eating Turmeric powder With hot water is a good remedy for curing Asthma.",
    		"11.Four Long pepper (Pipple) Boiled with a glass of Milk, Filtered added Jaggery or sugar and taking this milk everyday helps in during Asthma.",
    		"12.Bitter gourd ( karela) is also good for Asthma patients",
    		"13.Wheat grass juice taken everyday is a very good remedy to cure Asthma.",
    		"14.Drinking sweet lime (Mosambi) juice with hot water, Cumin (Jeera) powder and dry Ginger powder (Sonth) helps in curing Asthma.",
    		"15.Half gara, pof Alum (Phitakari) with a spoon of Honey Taken Help In asthama.",
    		"16.Natural Asthma Treatment with Mint",
    		"17.Drinking a spoon of Mint (Pudina) juice with water everyday helps to cure Asthma.",
    		"18.Ginger, Long pepper (Pipple), Black pepper (Kali Mirchi) in equal quantities powdered and one spoon of this powder taken with Honey everyday cures Asthma.",
    		"19.Drining Honey with hot water thrice a day helps to reduce Asthma.",
    		"20.Bael juice with spoon of long pepper (Pipple) powder of Honey taken thrice a week cures Asthma.",
    		"21.One cup of cow m,ilk or goat Milk mixed with a spoon of Turmeric Powder, Black pepper powder and Sugar taken everyday helps to cure Asthma.",
    		"22.Bael leaves boiled in water, filtered and this filtered water taken hot, helps to reduce Asthma.",
    		"23.Taking half spoon of Black pepper powder mixed with a spoon of Honey helps in reducing Asthma.",
    		"24.Banana leaf burnt and its ash mixed with Honey taken cures Asthma. This is very old traditional approach for asthma treatment.",
    		"25.Massaging the chest with Mustard (Sarson) oil mixed with Rock helps to get relief form Asthma.",
    		"26.Boiled milk with turmeric powder (haldi) (1 tsp) added could be taken instead of coffee or tea in the morning and night is a very beneficial for asthma treatment.",
    	},
    	
    	{
    		"1. Two or three cloves(Garlic) should be taken every morning.",
    		"2. An oil prepared form garlic and rubbed on the back will give a good result in backache.",
    		"3. An boil oil mix with Camphor & apply on your Back.",
    		"4. Ginger paste and eucalyptus oil could be applied on the affected area.",
    		"5. Heat/Ice therapy are simple and effective options for finding back pain relief at home.",
    		"6. A Proper Diet can prevent back pain and help control the symptoms of existing conditions. Nutritional supplements, herbs, and vitamins are all important parts of an alternative back pain relief program.",
    		"7. Massage the affected area with herbal oils using knuckles and increasing pressure slowly.",
    		"8. Soak 60 grams of wheat in water at night.It helps in relieving pain and increases the digestive strength of the body. In the morning along with the wheat add 30 grams Cuscus grass (khas khas grass) and 30 grams coriander. Mix this to make a paste and boil it in 250 grams of milk till two-third of it is left.",
    		"9. has khas grass and sugar candy mixed and powdered in the dose of 6 grams twice a day with milk is a good home remedy for back pain.",
    		"10.Massage your back with mint oil gently. It is proved to be the best home made remedy to fight back pain.",
    		"11.hujangasana, shalabhasana, halasana, uttarpadasana, and shavasana are proved to be better exercise to over come back pain. It is a part of yogic asanas.",
    		"12.Also massaging the back with turpentine oil has also been proved beneficial in providing relief to the back pain.",
    		"13.Application of raw potato in the poultice form has been found very effective in curing back pain.",
    		"14.The easy and helpful remedy for back pain is to take a piece of chebulic myroblan after taking every meal.",
    		"15.Heat the coconut oil or sesame oil on low flame adding 8 pieces of garlic in it.When mixture became cool, apply it and give massage on the affected area with light hands. Keep it for 3-4 hours.Take bath with warm water.",
    		"16.Vitamin C rich foods are good in relieving pain of backache. One should eat 2,000 mg of vitamin C everyday. Orange, grapes and pineapple etc are fruits which are rich in vitamin C and it is cure for back pain."
    	},
    	
    	{
    		"1. Applying the paste of Gram flour (Besan) mixed with curd on the whole body before bath cleans and opens with pores which helps in removinging bad body odour.",
    		"2. Bael leaves dried and powdered then mixed with Shikakai ( Soap nut) can be used for talking bath instead of soap helps to overcome Bad Body Odour.",
    		"3. Betel ( Pan ) leaves qrinded with equal quantity of Gooseberry ( Amla ) and this paste applied on the body Before talking bath cures Bad Body Odour.",
    		"4. Tamarind (Imli) leaves grinded with Banana tree root and applied on the body before talking bath also helps to overcomes Bad Body Odour.",
    		"5. Drinking Carrot (Gajar ) juice everyday Aniseed (Saunf) of Dhanai or even MInt leaves ( Pudina) helps to overcome Bad Body Odour.",
    		"6. After eating Radish ( Muli) eat Jaggery ( Gur) and Aniseed ( Saunf) or Dhania or even Mint leaves ( Pudina) helps to overcome bad odour.",
    		"7. After eating Radhish ( Muli) eat Jaggery ( GFur) and Aniseed (Sauf) to avoid Bad Body Odour.",
    		"8. Inhaling or smelling Basil (Tulsi) juice helps to overcome Bad Body Odour from nose.",
    		"9. Add a tablespoon of sandlewood paste in a glass of lime juice."
    	},
    	
    	
    	{
    		"1. Chewing Basil ( Tulasi) leaves everyday helps to stop bad breathing problem.",
    		"2. Equal quantities of Area nut ( Supari) Garlic and Nut meg (joyphal) Powdered. One spoon of this powdered taken with water before sleeping stops Bad Breath.",
    		"3. Pomegranate (Anar) skin can be boiled in water and washing mouth with this water hleps to cure Bad Breath.",
    		"4. CHewing Tender Henna (Mehendi) leaves and spiting its juice also helps to stop Bad Breath.",
    		"5. Boil some Mint (Pudina) leaves in water and keep drinking this water or just chewing Mint leaves helps to stop Bad Breath.",
    		"6. Durva (Dub, a grass used to worship Lord Ganesha) boiled in water and filtered water used as a mouth wash also stops Bad Breath.",
    		"7. Ginger juice mixed with hot water can be used as a mouth wash helps aslo stops Bad Breath.",
    		"8. Eating California raisin (Munakka) daily for 15 days helps to cure Bad Breath.",
    		"9. Washing mouth with Lemon water which helps also helps to stop Bad Breath.",
    		"10.Eating Roasted Cumin seeds (Jeera) or Carom (Ajwain) seeds or Carrom leaf or Aniseeds (Saunf) also helps to stop Bad Breath.",
    		"11.Sucking a cardamon (Elacichi) or Clove (Laung) after meals also helps to stop Bad Breath.",
    		"12.Long Pepper (Pipple) powdered and taken with Honey regularly helps to stop Bad Breath."
    	},
    	
    	{
    		"1. Pomegranate leaves grinded and this paste applied on the scalp regularly helps to overcome baldness problem.",
    		"2. Applying Lemon juice on the scalp helps in growing new hairs and thus helps in baldness problem.",
    		"3. Applying Onion paste regularly on the baldy are helps min growing new hairs and thus helps in curing baldness problem.",
    		"4. Applying Coriander (Dhania) paste regularly on the baldy areas hleps in growing new hairs and thus helps in curing baldness problem.",
    		"5. Banana pulp meshed with Lemon juice applied on the scalp regularly helps to overcome baldness problem.",
    		"6. Applying Neem oil the baldy area for some period helps in growing new hairs and thus helps in curing baldness problem.",
    		"7. Coriander seeds(dhania) soaked in water with addition of 1 tsp dried amla powder, overnight & the filtered liquid could be taken every morning.",
    		"8. Boil some dried aerial roots of banyan tree and lotus root in coconut oil. Use this on the scalp to stimulate hair growth."
    	},
    	
    	{
    		"1. California raisin (Munakka) can be given in the night before going bed cures bed wetting problem.",
    		"2. Giving a spoon of Honey Before sleeping helps in curing Bed Wetting problem.",
    		"3. Taking 2 Walnuts (Akhrot) with few Raisins (Kishmish) everyday helps to cure Bed Wetting problem.",
    		"4. Gooseberry (Amla) with sugar candy (Mishri) or Gooseberry Murabba given everyday helps in curing Bed Wetting problem.",
    		"5. Black berry (Jamun) seeds powder given with hot water in curing Bed Wetting problem.",
    		"6. Dry dates (Chuara) given in night with Milk also helps to overcome Bed Wetting problem."
    	},
    	
    	{
    		"1. During winter have a bath by adding one spoon of olive oil to the water will helps to get rid of skin scars. This is very good home remedy for body care during winter season.",
    		"2.Eating of pomegranate will cure back pain of the body. which will give instant relief to your body.",
    		"3. Old remedy: Dry up white Hibiscus flowers and neem leaves and make it as power. Take this powder daily, which will prevents the cancer.",
    		"4. Eating of Avocado fruit will cure your body pains.",
    		"5. Eat White Hibiscus buds with empty stomach, which will be the best medicine for all.",
    		"6. Laughing is a best medicine for a good health.",
    		"7. Have a bath twice daily.",
    		"8. Apply coconut oil to your body before going to bed.",
    		"9. Don't take food items which contains high in salt."
    	},
    	
    	{
    		"1. Take half table spoon fresh onion juice daily to get relief from Bronchitis.",
    		"2. Mix one tea spoon of turmeric powder in one or two cup of milk and give to bronchitis patient. This will give relief.",
    		"3. The tea prepared with small amount of ginger, cloves and black pepper powder and have to get relief.",
    		"4. Drink fresh cabbage juice daily as it is proven as one of the best home remedy to treat Bronchitis.",
    		"5. Warm castor oil planet leaves.Put them on a pan, heat them and make them cool. Spread on the chest for the night.",
    		"6. It is advisable to drink a glass of milk added with ½ teaspoon of dried turmeric powder. Twice or thrice on a day.",
    		"7. Consume the mixture of 50 gm of fresh spinach leaves and 1/2 liter added with a bit of ammonium chloride and one teaspoon of honey to it.",
    		"8. The good home remedy for initial stage of Bronchitis patient is to be on orange juice and water for at least couple of days.",
    		"9. A teaspoonful of honey and ginger juice dissolved in 150 ml of hot water will cause expectoration of trapped phlegm.",
    		"10.Prepare a mixture by adding 8 - 10 tablespoons of coconut milk with 1 tablespoon poppy seeds and 1 tablespoon of pure honey. Take this every night before going to bed.",
    		"11.Add 1 teaspoon of sesame seeds, with a teaspoon of linseed, a pinch of common salt, and a teaspoon of honey. Take above mixture at night for treating of chronic bronchitis.",
    		"12.Make a powder of seven almond kernels and mix it in a cup of orange or lemon juice. Have this emulsion regularly before sleeping. It would act beneficial in curing bronchitis.",
    		"13.Take some hot water, enough to convert one cup of linseed into a moist mealy mass. Wrap it in a thin cloth and apply this poultice on the front and back of the chest. Cover with a bandage."
    	},
    	
    	{
    		"1. Make 8 pills by mixing 25 gms of jaggery to fine paste made with Peepal tree leaves. Take this pill daily with milk to relive pain due to bruises."
    	},
    	
    	{
    		"1. Drinking of water mixed with sugar and 1 spoon of ginger juice for two days, you will notice that the burning urine problem will be gone. This is very natural homemade home remedy for burning urine.",
    		"2. Drinking lot of water especially hot water is the best remedy to throw out the infections material and heat form the body and in curing Dysuria.",
    		"3. Drinking Tender coconut water mixed with Jaggery(Gur) and haf spoon of Coriander (Dhania) powder helps in curing Dysuria.",
    		"4. Drinking cucumber (Kheera) juice twice a day helps to stop burinign and pain during urination and cures Dysuria.",
    		"5. Mix a spoon of Coriander (Dhania) powder in water in the night. Filter in the moprinihng and add sugar candy (Mishri) toi this decotion. Drinking this helps in curing burning in curing Dysuria.",
    		"6. Drinking a spoon of radish (Muli) juice in the morning also hleps in curing Dysuria.",
    		"7. Cardamon (Elachi) powder taken with Milk helps to cure Dysuria.",
    		"8. Around 10 grams of old Tamarind (Imli) pulp mixed with Tender coconut water or Tamarind pulp mixed water can be taken to cureDysuria.",
    		"9. Drining Carrot juice everyday helps to cure burning urine problem orDysuria.",
    		"10.Dry Ginger (Sonth) powder and sugar candu (Msishri) mixed with milk taken twice fa day also helps to cure Dysuria.",
    		"11.Taking Drumstick leaves (Muranka Bhaji) grinder and mixed with Jaggery also helps to cure Dysuria.",
    		"12.Drinking Honey with water every 2 hrs will cure Dysuria.",
    		"13.Luke warm water mixed with Lemon juice taken also helps to cure Dysuria.",
    		"14.Four spoons of Gooseberry (Amla) juice mixed with a spoon of sugar candy (mishri) powder taken twice a day help to cure Dysuria.",
    		"15.Dip few Raisins (Kishmish), Gooseberry (Amla) powder, sugar candy (Mishri) in the night and drinking this water in the morning is a best remedy to cure Dysuria.",
    		"16.Cardamon (Elaichi) powder, Roasted Cumin (Jeera) powder and sugar mixed in pure Butter can be taken twice a day helps to cure Dysuria.",
    		"17.Taking a spoon of Durva (dud, a grass used to worship Lord Ganesha) juice with a glass of fresh Milk also helps in curing Dysuria.",
    		"18.Drinking Water lemon or Bael juice helps in reducing burning sensation and cures Dysuria.",
    		"19.putting a Wet cloth on the naval reduces cooled and consumed makes cooling effect on the body and reduces burning and Dysuria.",
    		"20.Ridge gourd (Touri) taken in any form is effective in reducing burining and curing Dysuria.",
    		"21.Jo (Barley) boiled in water and cooled and comsumed makes cooling effect on the body and reduces burning and Dysuria."
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
    		"1. chewing 3-5 Basil (Tulsi) leaves everyday morning helps to prevent all type cancer .",
    		"2. Drinking Wheat grass juice everyday morning is a very helpful remedy which reduce cancer effects and also prevents cancer.",
    		"3. Drinking Beal juice or eating Beal pulp is beneficial in blood cancer and bone cancer.",
    		"4. Drinking own urine everyday morning also helps to reduce cancer effects.",
    		"5. Drinking cauliflower (phool gobi)juice in the morning helps to prevents and reduce cancer effects.",
    		"6. Drinking carrot juice twice a day empty stomach helps to reduce cancer effects .",
    		"7. carrot juice mixed with small quantity of spinach (palak) juice taken everyday helps to reduce cancer effects.",
    		"8. using cabbage ,cauliflower ,lemon ,carrot ,sweet lime (Mosambi),lentils(sabut dals)regularly in meals prevents and reduce cancer effects .",
    		"9. Drinking Durva (Dub ,a grass used worship lord ganesha)juice with honey regularly reduces cancer effects.",
    		"10.Being a good source of antioxidants, tamarind helps fight against cancer. Use Tamarind leaves, fruits and bark in different ways to cope up with Cancer.",
    	},
    	
    	{
    		"1. Salt, Chillies, Ghee, oil, spices (Masala) should not be taken at least 15 days after getting the Chicken pox symptoms. The food should be very light and easily digestible. Remember the salt will cause itching in rashes during Chickenpox so avoid using salt. Don't eat banana, brinjal, sweet pumpkin for some day even after the Chickenpox is completed cured. Don't touch the rashes and if the itching is intolerable one can use neem leaves to itch. Avoid talking bath for 15 days or till the rashes are completely subsides and dries up.",
    		"2. Boil neem leaves in water for 10 minutes and filter it. Drink a galls of the decoction in the empty stomach for 3 days for starting of the Chickenpox",
    		"3. For the taking bath after15 days, Boil some Neem leaves in water for sometimes and use this water for bathing. But rashes should not to be rubbed.",
    		"4. Drink lot to water to avoid dehydration which is a common problem during Chicken pox.",
    		"5. Drink Milk in sufficient quantity during Chicken pox but don't drink in the empty stomach can create gas.",
    		"6. To get rid of Chickenpox scares it very important that rashes should no to touched. Remember that it takes 1-2 month for the rash scars to get the original colours as the time required for pigmentation is more. Still following these home remedies can be used to get rid Chickenpox scares. But remember not to apply anything till the rashes dries.",
    		"7. Applying Honey on the Chicken pox Scares help to reduces them.",
    		"8. Applying Sandal wood oil(Sandalwood powder boiled with coconut oil and filtered) or pure Coconut oil also help to reduce Chicken pox scars.",
    		"9. To treat Chicken Pox Neem leaves are the best remedy. Directly apply the paste made by Neem leaves on the pox affected area."
    	},
    	
    	{
    		"1. Mixture of 3 grams neem tree flower and 2 grams black pepper given for every hour throughout the day helps to cure cholera very easily. This is very beneficial home remedy for cholera.",
    		"2. Eating Onion regularly helps to prevent Cholera and also reduces Cholera effects.",
    		"3. Drinking Lemon juice helps to kill Cholera bacteria and reduces Cholera effects.",
    		"4. Eating Garlic helps to reduces Cholera effects.",
    		"5. Drinking Bitter gourd ( Karela) juice also helps to reduces Cholera effects.",
    		"6. Cardamon (Elaichi), Tamarind (Imli), Mint leaves (pudina), Black pepper (kali Mirch) all grinder together and slowly sucking this mixture reduce Cholera effects. Especially it reduces vomiting and watery diarrhea.",
    		"7. Drinking sour Butter milk (Chaach) reduces vomiting and diarrhea during Cholera.",
    	},
    	
    	{
    		"1. People suffering from high Cholesterol should drink at least 8 to 10 glasses of water per day as it stimulates the activity of skin and kidneys thereby reducing excessive Cholesterol from the system.",
    		"2. Regularly eating Curd helps in reducing bad Cholesterol.",
    		"3. Regularly eating raw Garlic helps in reducing Cholesterol level.",
    		"4. Regular drinking of a decoction of Coriander (Dhania) seeds helps to stimulate kidneys and reduce Cholesterol level.",
    		"5. Regularly eating Ginger helps in reducing Cholesterol level as ginger helps in blood circulation and keeps liver healthy.",
    		"6. Regular physical exercises like bicycling, swimming, jogging etc are helpful in improving blood circulation and enhancing the good Cholesterol level.",
    		"7. Finely chopped Onion pieces mixed with a cup of Buttermilk along with half spoon of Black pepper (Kali mirch) taken regularly helps in reducing bad Cholesterol level.",
    		"8. Eat plenty of fruits with their skin as fruit skin contain pectin which is a soluble fiber that blinds Cholesterol.",
    		"9. Regularly chewing Sweet neem (Curry patta) or using them in cooking helps to reduce Cholesterol level.",
    		"10.Regularly eating Fenu greek (Menthi) seeds or Fenugreek sprouts helps in reducing Cholesterol level.",
    		"11.Eating unprocessed fiber rich wheat flour, whole wheat bread are rich in insoluble fiber which helps in flushing out oil from the intestine.",
    		"12.Soya flour, Barley, Oat all are helpful in reducing Cholesterol level.",
    		"13.Butter Milk in which 1/4 tsp pepper powder and 1 tbsp of finely chopped onions could be taken."
    	},
    	
    	{
    		"1. Make a fine form of paste by mixing the ginger, clove and salt. Eating the half spoon of this paste two times in a day will cure cold.",
    		"2. Inhaling the smell from smashed Thymol seeds cures cold. This is very useful homemade home remedy for cold.",
    		"3. Vitamin C deficiency can often cause Cold problems. So go for rich natural source of vitamin C like Oranges, Gooseberries (Amla), Sweet lime (Mosambi),Grapes, Guava (Amrud) etc.",
    		"4. Eating hot Gram flour halva helps in controlling running nose instantly and effectively. (Roast Gram flour with Ghee (Besan) till it changes to light brown color, Then add water and Sugar and cook for few minutes).",
    		"5. Eating a small piece of Onion (pea size) or sucking a piece of Clove (Laung) helps to get instant relief from cold or running nose.",
    		"6. Ragi mixed with Turmeric powder sprinkled on the burning coal and the fumes inhaled cures nose blockage or cold very fast.",
    		"7. Turmeric powder sprinkled on the burning coal and fumes inhaled (but after that don't drink water for 5 hours) cures nose blockage, cold very fast.",
    		"8. Boiling Long pepper (pipple) in the Milk with Sugar candy (Mishri) and drinking this milk helps in curing running nose or cold.",
    		"9. Eating a Apple everyday before meals cures and prevents running nose or cold.",
    		"10.Dry Ginger powder (Sonth) mixed with old Jaggery (Gur) taken twice a day helps to cure running nose or cold.",
    		"11.Milk boiled with Ginger, Black pepper (kali Mirch), Basil (Tulsi) leaves, Cloves (Laung), Red Sugar candy (Mishri) or Jaggery is very useful in curing Cold. This should be taken hot before going to bed, and cover the body to reserve body heat, for few days.",
    		"12.Few drops of Fresh neem leaves juice put in the nostrils cures running nose or cold easily.",
    		"13.Taking Steam with Eucalyptus oil drops helps in curing cold or nose blockage.",
    		"14.Rubbing the whole body using Salt while taking bath helps to cure cold or running nose.",
    		"15.Rating Sesame seeds (Til) roasted with ghee and mixed with Jaggery helps in curing running nose during winter.",
    		"16.Black pepper powder, Ginger juice and Basil juice mixed with Honey taken thrice a day cures running nose or cold.",
    		"17.Making Tea with few Mint (pudina) leaves or with Ginger or with Basil leaves and drinking cures running nose or cold.",
    		"18.Figs (Anjeer) Boiled in water and this hot water taken twice a day cures cold or running nose.",
    		"19.Taking Garlic in any form helps in curing running nose, sneeze or cold.",
    		"20.Betel leaf with a Clove can be taken to cure running nose or cold.",
    		"21.Aniseed (Saunf) and Cloves boiled in water for 10 minutes added Sugar and filtered. Drinking this hot decoction helps to cure cold or running nose.",
    		"22.Eating half spoon of Turmeric powder and drinking hot water for few days helps to overcome running nose or cold.",
    		"23.Drinking hot water with Lemon juice and Honey in the night helps to overcome running nose or cold.",
    		"24.Smelling Asafoetida (Hing) helps to reduce cold or running nose.",
    		"25.Tamarind (Imli) leaves boiled in water for few minutes and filtered. Taking this decoction also cures sold or running nose.",
    		"26.Make a slit in one Onion and fill Turmeric powder in the slit. Roast this Onion on a burning coal and eat before going to bed. Avoid drinking water whole night which helps in curing cold or running nose.",
    		"27.Applying Castor oil (Erand Ka teil) on the center of the head helps in curing running nose due to excessive heat in the body.",
    		"28.Drinking Tender coconut water in the day time helps in curing running nose due to excessive heat in the body.",
    		"29.Drinking a spoon of Betel leaves (Pan) juice helps to cure cold or running nose especially in children.",
    		"30.Drinking a spoon of Carom Leaf (Ajwain) Juice mixed with honey helps to cure cold or running nose especially in children.",
    		"31.Nut Meg (joy phal) paste with honey taken helps to cure cold or running nose especially in children.",
    		"32.Adding few drops of Doctors brandy in hot milk and given to children helps in curing cold or running nose.",
    		"33.Mix a gram of Cinnamon (dalchini) powder with a teaspoon of honey to curb a cold. Prepare a cup of tea to which you should add ginger, clove, bay leaf and black pepper. This should be consumed twice a day. Reduce the intake as the cold disappears.",
    		"34.Make soup from Tamarind pulp and take it to get relief from common cold."
    	},
    	
    	{
    		"1. Take Babul Tree leaves and ground them to a paste. Apply this paste on the affected eyes at night supported by a bandage. Untie the bandage next morning.",
    		"2. Boil 10 freshly cleaned neem leaves along with cotton with a liter of water for approx. 10 mins. use this as an eye wash."
    	},
    	
    	{
    		"1. Eating a Harad (Terminalia chebula, hartaki) everyday helps to over come Constipation.",
    		"2. Taking a spoon of Triphala (Triphala is composed of Hard (Haritaki), Indian gooseberries (Amla) and Bejada (Bibhitaki) every night before going to bed helps to clear the stomach next morning and cures Constipation problem.",
    		"3. Massaging the stomach everyday night with Mustard (Sarson) oil helps to cure Constipation problem.",
    		"4. Eating Lentil (Masoor dal) regularly helps to clear the stomach and cures Constipation problem.",
    		"5. Drinking at least 8 glasses of water per day preferably hot water in the morning helps to cure Constipation.",
    		"6. Eating Watermelon (Tarbooj) regularly for few days helps to cure Constipation problem.",
    		"7. Drinking raw Spinach juice (palak) for few days gives permanent relief from Constipation.",
    		"8. Eating a ripe Fig (Anjeeer) in the night or 5 dried figs boiled with Milk taken before going to bed helps to overcome Constipation.",
    		"9. Eating a ripe papita (papaya) before going to bed gives relief from Constipation problem.",
    		"10.Eating one raw Onion with every meals helps to cure Constipation problem.",
    		"11.Radish (Muli) taken with Salt and Black pepper (kali mirch) clears the stomach and gives relief from constipation.",
    		"12.Hot water with Lemon juice taken in the night gives relief from Constipation.",
    		"13.Using Garlic (Lehsun) regularly in cooking helps to get relief from Constipation.",
    		"14.Taking Guava (Amrud) with seeds provides roughage to diet and it act as a laxative in the intestine. It should be taken only before meals to get relief from Constipation.",
    		"15.Tomato is also said to be very good for constipation which helps in cleaning the stools which are sticking in the intestine.",
    		"16.Using Fenugreek leaves (Menthi) in meals also helps to reduce Constipation.",
    		"17.Eating 250 grams of Fresh Carrot (Gajar) everyday helps to increase appetite and reduce Constipation.",
    		"18.Drinking wheat grass juice regularly helps to overcome constipation problem.",
    		"19.Bitter gourd (karela) juice taken regularly or eating Bitter gourd helps to overcome constipation problem.",
    		"20.Eating a spoon of powdered Aniseed (Sauf) with hot water in the night helps to cure Constipation.",
    		"21.Using Amaranth (Cholayi) regularly in meals also helps to overcome Constipation.",
    		"22.Buttermilk (Chach) taken with Carrom seeds (Ajwain) helps to overcome Constipation.",
    		"23.Drinking 2-3 drops of Castor oil (Erand) with Milk in the night helps to overcome Constipation.",
    		"24.A Spoon of Ginger juice boiled with water taken regularly helps to overcome Constipation.",
    		"25.Eating raw Cabbage (patta gobi) everyday helps to overcome Constipation.",
    		"26.Drinking hot milk with Flea seeds (Isabgol) in the night helps to overcome Constipation.",
    		"27.Taking Half spoon of Black pepper powder mixed with pure Ghee which helps the stick stool to loosen. Later drink hot milk which helps to clear and stomach and cure Constipation.",
    		"28.Eating Grapes everyday also helps to overcome Constipation.",
    		"29.Eating Bael fruit or drinking Bael juice everyday helps to overcome Constipation as Bael is a good laxative and having more cooling effect on the body.",
    		"30.Sprouted Green gram (Moong) is a good remedy to relieve from constipation.",
    		"31.Eat one ripe Banana before going to bed everyday to avoid constipation.",
    		"32.Ripe Banana pulp mixed with Curd taken everyday helps to get relief from Constipation.",
    		"33.Eating a ripe Mango after meals helps to get relief from Constipation.",
    		"34.Eating raw Beetroot everyday helps to overcome Constipation.",
    		"35.Few drops of Castor oil mixed with a spoon of Lemon juice taken in the night helps to cure constipation.",
    		"36.1 Cup lime juice water could be taken early morning.",
    		"37.Drink Juice made of Neem leaves now and then to fight with Constipation. The Tickt rasa in the leaves is proved beneficial for indigestion.",
    		"38.Dry the leaves of Peepal tree in the shade and powder them. Make pills using adequate amount jaggery and anise solutions with water. Take this pill with warm milk at bed time.",
    	},
    	
    	{
    		"1. Ginger grinded and this paste cooked with Jaggery (Gur) and small quantity of Ghee can be made into small balls and can be stored for few days. Sucking this ball while having Cough is a very good remedy for curing Cough.",
    		"2. Milk boiled with Ginger, Black pepper (kali mirch), Basil (Tulsi) leaves, Cloves (Laung), Red Sugar candy (Mishri) or Jaggery is very useful in curing Cough. After drinking this milk cover the body and take rest for sometime. This can be repeated for few days.",
    		"3. Long pepper (pipple), Black pepper, Almonds (Badam), Read Sugar candy (Mishri) Powdered and mixed together and a tea spoon of this mixture taken everyday helps to cure Cough.",
    		"4. Basil (Tulsi) juice taken with Sugar candy (Mishri) helps to relieve from Cough, cold, fever.",
    		"5. Sucking a piece of Sugar candy or Black pepper or Ginger or turmeric or Cinnamon gives instant relief and slowly reduces Cough.",
    		"6. One fourth spoon of Black pepper (kali mirch) powder mixed with Ginger juice and Honey taken once in 2 hours reduces Cough within a day.",
    		"7. 4-5 Black basil leaves and one betel leaf (pan) with 2 Cloves (Laung) grinded together and taken will also cure Cough.",
    		"8. A spoon of Basil juice and Garlic juice with Honey or Basil juice with honey taken once in 2 hours helps to cure Cough.",
    		"9. Harad (haritaki0 paste applied on the chest helps to reduce Cough.",
    		"10.Gargling with hot water and Salt helps to clear phlegm (Balgum) and reduces Cough.",
    		"11.Bael pulp without seeds taken with Jaggery reduces Cough and phlegm (Balgum).",
    		"12.Bael pulp without seeds taken with Jaggery reduces Cough and phlegm (Balgum).",
    		"13.Turmeric and Black pepper boiled with Milk, filtered and this Milk taken twice a day helps to cure Cough.",
    		"14.Sucking a small piece of raw Onion or raw Garlic helps to reduce Cough.",
    		"15.Eating a Apple regularly for a week cures Cough completely.",
    		"16.Cinnamon (Dalchini) and Black pepper boiled in water and filtered and this decoction taken with Honey cures Couch and reduce phlegm (Balgum).",
    		"17.Carom seeds (Ajwain), Fenugreek seeds (Menthi) boiled with water, filtered and this decoction taken with honey reduces Cough and phlegm (Balgum).",
    		"18.Gooseberry (Amla) powder taken with Honey cures Cough.",
    		"19.Gooseberry grinded with Coriander (Dhaniya) leaves taken helps to cure dry Cough.",
    		"20.Eating Figs (Anjeer) helps to reduce phlegm (Balgum).",
    		"21.Sesame seeds (Til) and Sugar candy (Mishri) boiled in water for 10 minutes filtered and this decoction taken thrice a day helps to cure Cough.",
    		"22.Aniseed (Saunf), Carom seeds (Ajwain) boiled in water, filtered and this decoction mixed with Honey taken thrice a day helps to get relief from Cough.",
    		"23.Tea made with Ginger and Mint (pudina) helps to cure Cough..",
    		"24.Violet tender Brinjal (Baingan) boiled and taken regularly helps to reduce Cough problem.",
    		"25.Carom leaves (Ajwain) grinded with Garlic and be taken as a chutney to cure Cough.",
    		"26.Four spoons of Onion juice mixed with a spoon of honey taken regularly cures Cough.",
    		"27.10 grams of Ginger, Long pepper (pipple), Black pepper each, with 30 grams of Glycyrrhiza glabra (Jyeshta madhu) powdered and taken one spoon with Honey thrice a day cures severe Cough.",
    		"28.Equal quantities of Harad (Haritaki), Gooseberry, Glycyrrhiza glabra (Jyeshta madhu) powdered and one spoon of this powder taken with one spoon of Sugar with Milk thrice a day cures severe cough.",
    		"29.10 grams of Glycyrrhiza glabra (Jyeshta madhu) powdered and boiled with Milk for 10 minutes, filtered and this Milk taken with Honey thrice a day helps to cure severe Cough.",
    		"30.Glycyrriza glabra (Jyeshta madhu) powder boiled with Milk, added with Sugar, filtered and taken helps to get relief from Cough.",
    		"31.Raisin (Kishmish), Black pepper, Licorice (Mulethi) in equal quantities powdered and taking a pinch of this powder thrice a day helps to cure severe Cough.",
    		"32.Maalbar (Abdulasa, adusoge) leaf juice with Honey and Rock salt taken twice a day helps to cure severe cough.",
    		"33.Add a pinch of salt with two pinches of turmeric powder to one glass of warm water and gurgle.",
    		"34.Add a gram of turmeric (haldi) powder to a teaspoon of honey for curing dry cough. Also chew a cardamom for a long time.",
    		"35.Using neem water relieves Cough."
    	},
    	
    	{
    		"1. Use lukewarm water for head bath, which will helps to clean the dandruff very effectivly.",
    		"2. Applying of Mahua Tree oil to scalp helps to remove dandruff. This is one of the most beneficial traditional Indian herb for dandruff.",
    		"3. Mix of two portions of Asteraceae leaves juice and 1 portion of sesame seed oil. Heat these together and filter the oil after it becomes good mixture. Massage your scalp with this oil and wait for 2 to 3 hours of time. This procedure will helps to remove dandruff completely.",
    		"4. Mix the water with pulp extracted from Balanites Aegyptiaca fruit till you see foam. Apply this mixture to hair scalp and wash you hair after some time helps to remove dandruff.",
    		"5. Fenugreek (menthi) paste applied on the scalp an hour before taking bath helps to overcome Dandruff problem.",
    		"6. Applying Lemon juice on the scalp for an hour before taking bath helps to overcome Dandruff.",
    		"7. sour curd applied on the scalp 10 minutes before taking bath helps to get rid of Dandruff.",
    		"8. Reetha (soap nut) used for washing hair helps to get relief from Dandruff.",
    		"9. Indian gooseberries (amla)paste applied on the scalp before taking bath helps to get relief to FROM Dandruff",
    		"10.Hibiscus leaves boiled in small quantity of water and used along with shikaki as a hair wash instead of soap ,shampoo helps in reducing Dandruff problem . this is a natural hair conditioner.",
    		"11.GRAM flour (Besan) MIXED mixed with curd applied on the scalp before bath helps to remove Dandruff.",
    		"12.Boiled Beetroot leaves used for washing hairs helps to get rid of Dandruff.",
    		"13.Regular oil message on the scalp helps to get relief from Dandruff.",
    		"14.Neem paste or sweet neem (curry patta) paste mixed with Basil(Tulsi)PASTE applied on the sclap helps to remove Dandruff.",
    		"15.Grinded pigeon pea (Arhar dal) applied on the scalp before taking bath helps to remove Dandruff.",
    		"16.APPIYING Crushed raw papaya (papita)paste on the scalp 10 minutes before taking bath is very helpful.this process assists in the exfoliation of dandruff flakes and slow down fungal growth. papaya contains enzyme papain which is very helpful in reducing dandruff and hair fall problem.",
    		"17.Boil the fresh neem leaves in water for 1/2 hour. Filter the liquid & cool, apply the juice on hair and soak for 10 minutes. Wash it away while bathing.",
    		"18.Add six spoonfuls water, two spoonfuls pure vinegar and apply it on the scalp with cotton wool before going to bed. Tie a towel around your head to protect the pillow. Wash your hair next morning. After shampooing, rinse again with vinegar water. Continue this once a week for at least three months.",
    		"19.Mix a spoonful of lemon juice with two spoonfuls of vinegar and massage on the scalp. Wash your hair with an egg shampoo after this.",
    		"20.Soak fenugreek (methi) seeds in yogurt overnight and apply the curd on your scalp for half an hour before washing in the morning.",
    		"21.Hair washed with methi seed paste prevents dandruff, falling hair, baldness and dandruff keeping the hair long, healthy and black. Just soak the fenugreek seeds overnight in water to soften the seeds and grind in the morning to make paste. Before hair wash, apply this paste on scalp and hair and leave it on for half an hour. Wash off with shampoo later.",
    		"22.Beat two eggs and add two tablespoons of water to it. Wet the hair and apply the egg mixture over the hair. Now massage your scalp and let the mixture on for ten minutes to fifteen minutes. Then rinse the hair with lukewarm water. This will keep both dandruff and hair fall problem away from you.",
    		"23.Soak a few (4-5) tablets of camphor in your hair oil (coconut) to keep away dandruff and lice.",
    		"24.To get rid of dandruff apply the following mixture of once or twice a week. Keep for 20-25 minutes before washing off with a mild soap or shampoo. Warm together, 1 tbsp. curds, 2 tsp. oil and 1 tsp. lemon juice.",
    	},
    	
    	{
    		"1. Drinking of coriander seeds decoction mixed with sugar candy (Mishri) or honey will depression cures without drugs.",
    		"2. A pinch of finely powdered cardamom seeds could be taken mixed with black tea.",
    		"3. Regular exercise can helps to get rid of depression and helps to feeling better.",
    		"4. Regular diet will helps to feel better",
    		"5. Never think in-depth of any problem, which causes your depression.",
    		"6. Watch comedy movies or comedy shows will helps to feel better",
    		"7. Always try to spend with your friends, so that it will helps you to feel better! When you are in depression",
    		"8. Never stay alone, when you are in depression mood."
    	},
    	
    	{
    		"1. Rotis made up of Ragi, Ragi soups, Ragi balls, Ragi in milk can be used. Raghi used in any form is beneficial in Diabetes.",
    		"2. Eating a cup of home made Curd helps to slow down the progression of Diabetes. induced by high fructose administration.",
    		"3. Taking Bitter gourd ( Kerela) Juice or bitter gourd in any form helps to control Diabetes.",
    		"4. Black berries (Jamun) seeds powdered and taken regularly and also eating Black berries helps to control Diabetes.",
    		"5. pieces of stem chopped from Red kino tree ( Honne) boiled in water, filtered and this decoction taken helps to control Diabetes.",
    		"6. Chewing few leaves of Sweet neem ( Curry patta) everyday morning also helps to reduced Diabetes.",
    		"7. Eating a Indian gooseberry ( Amla) everyday helps in reducing Diabetes.",
    		"8. Indian gooseberry (Amla) powder with Turmeric powder taken in the empty stomach also helps to reduce Diabetes.",
    		"9. Dip Fenugreek (Menthi) seeds overnight, eat them in the empty stomach in the morning or use fresh frenugreek leaves in cooking which cures Diabetes.",
    		"10.Drinking Lemon water in the morning helps in reducing Diabetes.",
    		"11.Beal fruit taken in any form is also help in redcuing Diabetes.",
    		"12.Salted Buttermilk ( Chach ) take in the morning helps to reduces Diabetes.",
    		"13.Nut meg ( Jay phal) powder with pure Ghee taken regularly helps to reduces Diabetes.",
    		"14.Orange skin dried in the shade and powdered. A spoon of this powdered boiled in water and filtered, this decoction taken helps to reduces Diabetes.",
    		"15.Eating Tomato juice or raw Tomato regularly helps to reducing Diabetes.",
    		"16.Basil leaves ( Tulsi) chewed in the morning helps in reducing Diabetes.",
    		"17.Sadabahar(Vinca rosea) is a food rescues the blood sugar level. Boil one glass of water. in half glass of water, put of 3 flowers of Sadabhar, leave for 5 minutes the drink the water by removing the floser. Then drink the water by removing the flower. Then drink the other half glass of hot water. Continue for 7 days which is a good remedy for curing reducing Diabetes.",
    		"18.The best remedy for this disease is the bitter gourd, better known as ‘karela’. Eat this vegetable as often as you can or have at least one tablespoon of karela juice daily to reduce blood sugar levels in your blood and urine.",
    		"19.Besides, take ten tulsi leaves, ten neem leaves and ten belpatras with a glass of water early morning on an empty stomach. It will work wonders in keeping your sugar levels under control.",
    		"20.Consume 2 cloves of garlic with water every morning on an empty stomach. Garlic helps in reducing blood sugar levels.",
    		"21.Eat 5-10 grams of jamun seed powder every morning. It directly works on the pancreas.",
    		"22.Paste prepared with Neem leaves is proven effective for diabetes.",
    		"23.Soak 2 inches bark overnight in a glass of water. Next morning squeeze the bark and drink the infusion.",
    		"24.Infuse banyan tree bark. It is proved as a specific medicine for Diabetes.",
    		"25.Neem juice if taken regularly is said to be effective for diabetes and controls the blood sugar levels to a great extent."
    	},
    	
    	{
    		"1. A glass of water can be boiled and cooled., Slight sugar and salt can be added. Drinking this water frequently helps to avoid dehydration during Diarrhea.",
    		"2. Drinking lemon juice 4-5 times a day helps to cure Diaaarrhoea.",
    		"3. Pomegranate (Anar) leaves boiled in water with sugar and filtered. Drinking this fecoction 3 times a day helps to cure Diarrhea.",
    		"4. Drinking half cup of Mint (pudina) juice in every two hours helps to cure Diarrhea.",
    		"5. Wall nut (Akhrot) grinded with water and this paste applied in the naval helps to cure Diarrhea.",
    		"6. Drinking Basil (Tulsi) juice mixed with Betel (Pan) juice helps to cure Diarrhea.",
    		"7. 0range juice mixed with milk taken helps to cure Diarrhea especially for children.",
    		"8. Eating a spoon of Dhania ( Coriander) powder with black salt after meals in helpful in curing Diarrhea.",
    		"9. Drinking hot water mixed with Ginger juice once in a hour helps to cure Diarrhea.",
    		"10.A spoon of pure Ghee ( made from cows milk of buffaloes milk) taken with hot both morning and evening helps to cure Diarrhea.",
    		"11.Eating a spoon of Carom seeds (ajwain) powder with hot water helps to reduce Diarrhea.",
    		"12.Eating a ripe Banana with Buttermilk (Chaach) is good remedy to cure Diarrhea.",
    		"13.Apple pieces without skin boiled in milk taken 3 times a day (but not directly apple juice) cure Diarrhea.",
    		"14.One gram of Neem seeds and one gram of Sugar taken with hot water and eating only boiled Rice with Curd in the meals cures Diarrhea.",
    		"15.Eating Carrot is good for curing prolonged Diarrhea.",
    		"16.One spoon of Ginger juice half cup of curd mixed with half cup of mango juice and take helps to cure Diarrhea.",
    		"17.For watery Diarrhea taking a spoon of roasted cumin seeds (Jeera) with half spoon of Honey 4 times a day is helpful.",
    		"18.For watery Diarrhea taking roasted cumin seeds (Jeera) and Black salt with Buttermilk after meals is helpful.",
    		"19.Boil Aniseeds (Saunf) with water and filtered. This filtered water can be used to make flour dough for making Rotis. Eating those Rotis are beneficial during Diarrhea.",
    		"20.Taking twp teaspoon of Flea seeds (Isabgol) with curd both in the morning and evening cure Diarrhea.",
    		"21.2 grams of cinnamon (Dalchini) powder taken with warm water 3 times day helps to cure Diarrhea.",
    		"22.For Diarrhea in children it is advisable to give Aniseeds (Saunf) water with a pinch of Black Salt.",
    		"23.A spoon of Honey taken with half glass of Buttermilk (chach) helps to cure Diarrhea.",
    		"24.Mix few flea seeds (Isabgol) with curd. Add salt dry Ginger (saunth) cumin seeds (Jeera) powder and drinking this for few day helps to cure Diarrhea.",
    		"25.Eating Lentil (Masoor dal) is good for people having Diarrhea.",
    		"26.Onion paste applied on the naval helps to stop Diarrhea.",
    		"27.Half spoon of Day Gooseberries (Amrud) leaves with water mixed with same quantity of Black salt with water helps to cure Diarrhea.",
    		"28.Eating boiled raw papaya (papita) is good for Diarrhea.",
    		"29.BOIL TENDER GUAVA (AMRUD)Leaves with water ,filtered and drinking this decoction helps ti cure Diarrhea.",
    		"30.Left out water after after boiling rice (chawal)is good for Diarrhea. for children half cup and for adults one cup of this water can be given which cures Diarrhea.",
    		"31.TAKING HALF CUP OF MANGO JUICE and 25gm curd with a spoon of Ginger helps to cure prolonged Diarrhea .",
    		"32.Take 3 black berry (jamun) leaves ,neither too tender nor too ripe ,grind them with rock salt(Saindha namak) and make a tablet of it and evening to get instant cure for Diarrhea.",
    		"33.Taking mango seed powder with Buttermilk is a good remedy to cure Diarrhea.",
    		"34.Fenugreek (menthi)seeds powder taken with BUTTERMILK Or curd helps to stop Diarrhea.",
    		"35.20 grams of black beery (jamun)seeds grinded with water and taken twice a day helps to stop Diarrhea.",
    		"36.Drinking half spoon of Lemon juice with goat milk helps to stop Diarrhea.",
    		"37.Onion pieces or spring onion (onion flower)taken with fresh curd also stops Diarrhea.",
    		"38.pomegranate juice (Anar)taken 3 times a day gives relief from Diarrhea.",
    		"39.Drinking pomegranate juice (Anar) mixed with equal quantity of sugarcane (Ganna)juice helps to cure DIARRHEA.",
    		"40.15 gram of coriander powder (dhania) and 12 grames of sugar candy (Mishri) taken with water stops Diarrhea.",
    		"41.Taking ber Fruit (ZiZypus)helps to cure wounds in the intestine during Diarrhea.",
    		"42.SWEET Neem (curry patta) leaves grinded and taken with buttermilk or chewing sweet neem leaves with pure Honey stops Diarrhea.",
    		"43.Eating Dates (Khajur) everyday helps to overcome loss of nutrients during Diarrhea.",
    		"44.pomegranate (Anar) skin grinded and taken with Buttermilk stops Diarrhea.",
    		"45.Making Tea With cardamom powder (Elaichi) and drinking this tea also stops Diarrhea.",
    		"46.Eating Banana with sugar or eating Banana mixed with Buttermilk also cures Diarrhea.",
    		"47.Chewing carom (Ajwain)seeds after every meals also stops Diarrhea.",
    		"48.Eating Boiled jo (Barley) also helps to stop Diarrhea.",
    		"49.Beet root juice mixed with honey can be taken which helps to stop Diarrhea.",
    		"50.MIX GUAVA (Amrud) pulp without seeds and a spoon of Honey in milk .Drinking this milk helps in curing Diarrhea.",
    		"51.Eating small pieces of raw Mango or grounded raw mango skin with Buttermilk twice a day also helps in curing Diarrhea.",
    		"52.Taking Banana pulp and Tamarind (Imli)pulp mixed in a glass of Buttermilk for 2-3days cures Diarrhea.",
    		"53.Pound the hanging roots of banyan tree and take along with cow's buttermilk to treat diarrhea.",
    		"54.Soak the leaf buds of Banyan tree over night and take it as an infusion. It treats the chronic Diarrhea.",
    		"55.Take 1 tsp tamarind pulp, a cup of butter milk and a mashed ripe banana and blend it and have it. It provides relief from diarrhea quickly.",
    	},
    	
    	{
    		"1. Drinking a cup of hot water with two spoons of lemon juice gives instant relief from Dizziness.",
    		"2. Drinking water mixed with lemon juice, Jaggery (gur) or sugar, Cardamom powder (elaichi) gives instant relief from Dizziness.",
    		"3. Drinking Basil (Tulsi) Juice mixed with Sugar helps to get relief from Dizziness problem.",
    		"4. Coriander (Dhania) seeds boiled in water with Sugar candy(Mishri),filtered and drinking this decoction gives instant relief from Dizziness.",
    		"5. Two spoons of Carom leaves (Ajwain) juice taken everyday helps to overcome Dizziness problem.",
    		"6. Taking pineapple pieces with Salt gives instant relief from Dizziness.",
    		"7. Eating Gooseberry (Amla) with Sugar or eating its Murabba also helps to control Dizziness."
    	},
    	
    	{
    		"1. Applying 2-3 drops of Mustard ( Sarson ) oil in the naval after bath and before to bed is the best remedy for curing dry and chapped lips problem.",
    		"2. Applying pure Ghee or pure Butter or Coconut oil on lips cures Dry and Chapped lips problem.",
    		"3. Applying Glycerin on the lips also helps to overcome dry and chapped lips problem.",
    		"4. Pure Butter mixed with a pinch of Salt applied on the lips cures dry and chapped lips problem.",
    		"5. Eating Almonds ( Badam ) powder mixed with butter can be taken for 7 days will completely cure dry and chapped lips problem.",
    		"6. Cardamon (Elaichi) powder mixed with Butter can be taken for 7 days will completely cure dry and chapped lips problem.",
    		"7. Rub a fresh Aloe Vera (Gwar oath) leaf on the lips helps to overcome dry and chapped lips problem.",
    		"8. Applying fresh Milk cream on the lips helps to cure dry and chapped lips problem."
    	},
    	
    	{
    		"1. Glycyrrhiza glabra (Jyestha madhu) powder mixed with lemon juice and Honey taken thrice a day cures Dry cough.",
    		"2. Taking Jaggery (Gut) mixed with few drops of Mustard (Sarson) oil helps to cure Dry cough.",
    		"3. Eating Dates (Khajur) also helps to cure Dry cough.",
    		"4. Drinking Sugar cane (Ganna) juice also helps to get relief from Dry cough.",
    		"5. Black pepper (Kalli mirchi) and sugar cane (Mishri) powder and mixed with pure Ghee can be made3 like a ball, sucked slowly to get relief from Dry cough.",
    		"6. Almonds ( Badam) and Black pepper (Kali mirchi) crushed and boiled with milk for 10 minutes later added with red sugar candy ( Mishri ) or sugar and taken hot without filtrating cures Dry cough.",
    		"7. Ginger paste cooked with Jagger ( Gur ) and small quantity of Ghee can be made into small balls. Sucking this balls gives instant reliefs and cures Dry cough."
    	},
    	
    	{
    		"1. Using of Indian Hemp leaves juice about 8 to 10 drops in ears can helps to kill germs in your ear. Also helps to cure ear ache problem. This is one of the natural home remedy for ears problem.",
    		"2. If you have ear infection, fill 3 to 5 drops of coconut oil in your infected ear and close with cotton before going to bed.",
    		"3. Clean your ears daily with water while taking bath, which will prevents you from ear ache & infections.",
    		"4. Use ear buds to clean your ears after having head bath.",
    		"5. When you take bath or came from outside, you should clean your ears properly by rubbing gently with your fingers and then clean with ear buds to avoid formed dust in or near to ears.",
    		"6. If you can't hear properly, then close your ears for a moment and open it gently to hear properly. Which will helps to hear properly when attending any meetings. Without hearing its waste of energy & waste of time to attend meeting. Most of the people don't know this, but i do in my regular life.",
    		"7. Ear Disease: Decoction prepared from tender leaves of Neem, when warm, could be used as ear drops."
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
    		"1. Two to three cloves of raw garlic should be chewed daily. Thus is very beneficial home remedy for erectile dysfunction.",
    		"2. Onion is important aphrodisiac food. It increases libido and strengthens the reproductive. Therefore is a very beneficial home remedy for erectile dysfunction.",
    		"3. For better results, about 150 gm of carrots, chopped finely, should be taken with a half-boiled egg, dipped in a tablespoon of honey, once daily for a month or two.",
    		"4. Dried dates are known to be highly beneficial for impotency. They can be used by pounded and mixing them with almonds, pistachio nuts, and quince seeds in equal quantities, about 100 gm should be taken daily as an effective medicine for curing erectile dysfunction.",
    		"5. Mud packs and cold-water treatments are also an essential therapy to overcome erectile dysfunction.",
    		"6. Chickweed, safflower and plantain serve as highly beneficial home remedies for Erectile Dysfunction by improving hormonal imbalance.",
    		"7. Mix one part walnuts and one part honey. Take the mix three times a day 30 minutes after meals. You have to drink milk right after.",
    		"8. Mix two tablespoons of ground carrots with one glass of milk and heat it on low heat for ten minutes. Take 100 ml of the extract three times a day for one week.",
    		"9. Dry the Peepal fruits in the shade and powder them. This powder helps in treating ED."
    	},
    	
    	{
    		"1. Harad (haritaki) grinded and applied on the body 10 minutes before bath helps to cure excessive sweating problem.",
    		"2. Goose beery (amla) juice applied on the affected area before bath cures excessive sweating problem.",
    		"3. Raw brinjal (baigan) paste applied on the affected area before bath cures excessive sweating problem.",
    		"4. Alum (phitkiri) dissolved in water can be used to wash the affected parts which helps to cure excessive sweating problem .",
    		"5. Brinjal pieces with poppy seeds (khus khus) grinded and this paste applied on the effected area before bath cures excessive sweating problem.",
    		"6. Roasted green gram (moong) powder mixed with water to make a paste. This paste rubbed on the affected area before bath helps to cure excessive sweating problem.",
    		"7. Brinjal pieces dipped in water for sometimes and this water used to wash the affected parts cures excessive sweating problem.",
    	},
    	
    	{
    		"1. Onion for Ophthalmia or Sore eyes",
    		"2. To stop running water from sore eyes, apply the fresh onion juice to the sore effected eyes.",
    		"3. Washing of sore eyes with human urine can helps to cure sore eyes problem very fast.",
    		"4. Vitamin A is the best source for good vision.",
    		"5. Eating a carrots will helps to improve your eye vision.",
    		"6. Always wash your eyes with cold water when you feel your eyes are tired.",
    		"7. Place cucumber slices on your closed eyes for about 1 hour for eyes care.",
    		"8. Heat the soaked chamanthi flowers in a water and rubbing your eyes with these water can cure burning sensation in the eyes.",
    		"9. Clean gently with towel after having bath or after washing your face.",
    		"10.When your eyes are tired: take one ice cube and rub gently on your closed eyes and take rest about 15 minutes.",
    		"11.Switch it on exhaust fan when you cook, which will helps to relieve from eyes strain.",
    		"12.Taking Mishri (sugar) water as eye drops to change redness in eye of sore eyes.",
    		"13.Using of forest grape tree leaves juice as eye drops can helps to bring clearness to the eye or sight.",
    		"14.First make a scratches on Sampenga tree (Magnolia champaca)leaves with knife and soak in water for some time. After some time using these water as eye drops to the eyes can gives us clearness or clear vision to our eyes.",
    		"15.Extracting the paste by rubbing the Vasa Kommu on floor and applying this paste to the eyes can helps to give vision brightness.",
    		"16.Spraying of mishri (sugar) water on eye balls can cure burning or smarting sensation in the eyes."
    	},
    	
    	{
    		"1. Eating of cumin seeds with jaggery (bellam) cures the fever, which is troubling you for a long time.",
    		"2. Taking of 20 to 40 grams of holy black basil (Krishna Tulsi) leaves juice can cure fever. Holy black basil is a very good natural home remedy for fever treatment.",
    		"3. Drinking of 30 to 80 grams decoction made with the roots of holy black basil (krishna tulsi) plant two times in a day can helps to cure not only common fever but also cures all types of fever.",
    		"4. Fever Treatment with Datura",
    		"5. Eating of 3 Datura (Ummetha) seeds three times in a day helps to cure fever. Datura is the very good home remedy for fever.",
    		"6. Boiling root powder in water to prepare a concentrate (1 cup reduced to ½) could be taken, with a little sugar added, daily morning on the empty stomach.",
    		"7. Prepare sharbat by boiling by some tamarind pulp in half liter of milk and adding some dates, cloves, sugar, cardamoms and a very little camphor. It lessens the fever.",
    		"8. Use Peepal leaves as laxative and tonic. They relieve feverish feeling of coolness.",
    		"9. The bark of Tamarind acts as an astringent, a tonic and it reduces fever. Use the bark as laxative.",
    		"10.Applying of small mustard seeds oil to the body is helpful for people who are suffering with dengue fever. Usually dengue fever effected people suffering with joint pains and pains in the legs and hands.",
    	},
    	
    	{
    		"1. Add 10-20 drops of either tea tree, eucalyptus, lemon or lavender oil to your hot water bath.",
    		"2. Take 1 tbsp of lukewarm honey mixed with 1/4 tsp of cinnamon powder daily for 3-4 days. It strengthens the immune system and protects the body from bacteria and viral attacks.",
    		"3. Gargle with salt water solution. It will wash out any secretions collected in your throat.",
    		"4. Mix bayberry bark with ginger root in the following amounts: 1 teaspoon of bayberry bark, 1 teaspoon of grated ginger, and 1/2 teaspoon of cayenne powder and add to 1 cup of boiling water, allow it to steep for about 30 minutes and have it."
    	},
    	
    	{
    		"1. Eating Carom(ajwain) seed and black salt with hot water gives immediate relief from gas or flatulence.",
    		"2. Eating a piece of Jaggery (Gas) after every meal helps to get relief form gas or flatulence.",
    		"3. Eating Orange in the morning cleans the intestine thereby reducing gas formation or eating Orange with Black salt gives instant relief from gas or flatulence.",
    		"4. Eating Radish (Mooli) with salt and Black pepper (Kali mirch) helps to overcome gas or flatulence.But remember Radish digests everything but it cannot digest itself so after eating Radish eat a piece of jaggery or eat Radish leaves.",
    		"5. Drinking Mint (pudina) juice helps to get instant relief from gas or flatulence.",
    		"6. Eating Turmeric and Salt everyday morning helps to overcome gas or flatulence problem.",
    		"7. Guava(Amrud) taken with Salt everyday morning helps to overcome gas or flatulence problem.",
    		"8. Sprouted fenu greek (menthi) seed or Fenugreek seeds taken with salted Buttermilk (chach) helps to get relief from gas or flatulence.",
    		"9. chewing a piece of Ginger before meals improves digestion and helps in reducing gas formation.",
    		"10.Using Asafoetida (hing) Fenugreek (menthi) seeds, Cumin seeds (Jeera),Carom seeds (Ajwain), Garlic Ginger regularly in cooking helps to overcome gas or flatulence problem.",
    		"11.Drinking Bitter gourd Juice (karela) helps to overcome gas, flatulence problem.",
    		"12.Boil 5-6 Cloves (laung) in water. Drink this after cooling which helps to overcome gas or flatulence.",
    		"13.Asafoetida (Hing) paste applied on the naval gives instant relief from gas or flatulence.",
    		"14.Taking Roasted Cumin (Jeera) powder with Honey after meals helps to reduce gas or flatulence problem.",
    		"15.Lemon juice and Black pepper (Kali mirch) powder taken with hot water helps to overcome gas or flatulence.",
    		"16.Boil Ginger piece or Long pepper (Pipple) or Black pepper (Kali mirch) powder or Cumin seeds (Jeera) in Milk helps to overcome gas or flatulence problem due to plain milk.",
    		"17.Drinking Cabbage (Patta gobi) juice or Carrot juice hekps to overcome gas ot flatulence.",
    		"18.Sitting for a 5 min in a upright posture (Vajrasan) after every meals gives instant and permanent relief from gas or flatulence.",
    		"19.Raw Garlic taken regularly or using Garlic in cooking helps to overcome gas problem."
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
    		"1. Applying Onion paste on the scalp for days before taking bath helps Grey hair to turn gradually.",
    		"2. Lemon juice mixed with Gooseberry (Amla) powder applied on the scalp for few days helps Grey hair to turn black gradually.",
    		"3. Eating Sesame (Til) seeds daily and applying its oil regularly helps grey hair to turn black.",
    		"4. Eating Fenugreek(Memthi) sprouts regularly and applying Fenugreek paste on the scalp an hour before taking bath once in a week helps to overcome Grey hair problem.",
    		"5. Bael leaves grinded and applied 2 hours before taking bath regularly helps to overcome Grey hair problem.",
    		"6. Durva (Dub a grass used to worship Lord Ganesha) paste applied before taking bath regularly helps Grey hair to turn black gradually.",
    		"7. Regularly applying Butter or Butter mixed with Fenugreek powder on the scalp and taking bath with cold water helps to overcome Grey hair problem.",
    		"8. Neem oil prevents hair from graying and also effective in treating dandruff, lice and hair fall.",
    		"9. Half cup of Curd Mixed with a pinch of black pepper (kali mirch) powder and spoon of Lemon juice applied 15 minutes before taking bath helps grey hair to turn black slowly.",
    		"10.Regular application of Henna (Mehandi) paste applied an hour before taking bath helps Grey hair to turn black slowly.",
    		"11.Drinking Wheat grass juice everyday helps to overcome Grey hair problem.",
    		"12.Boil Triphala (Triphala is composed of Harad (Haritaki) Amla (Indian gooseberries) and behada (Bibhitaki) powder in Gingery (Thil) oil and this filtered oil applied regularly on the scalp help Grey hair to turn black.",
    		"13.Guava (Amrud)leaves grinded and applied regularly on the hair before taking bath helps Grey hair to turn black slowly.",
    		"14.Neem seeds grinded and applied on the scalp and boiled Neem leaves used for washing hair helps Grey hair to turn black slowly.",
    		"15.Massaging scalp regularly with ghee (Prepared from cow milk) also helps to overcome Grey hair problem.",
    		"16.Drinking Carrot juice everyday helps to keep hair black and helps to overcome Grey hair problem.",
    		"17.Neem oil prevents hair from graying and also effective in treating dandruff, lice and hair fall."
    	},
    	
    	{
    		"1. Apply oil to your hair every day, it helps to prevent hair fall.",
    		"2. Use kunkudu, seekakaya powder to head bath, it will help to prevent hair fall problem.",
    		"3. While having head bath add some salt to water, which will helps to remove dandruff and stops hair fall. This is very natural home remedy for hair fall.",
    		"4. Fenugreek (Menthi) paste applied regularly on the scalp an hour before taking bath helps to overcome hair fall problem.",
    		"5. Hibiscus leaves boiled in small quantity of water and along with Shikakai as a hair wash instead of soap,shampoo helps in controlling hair fall problem. This is also a natural hair conditioner.",
    		"6. Neem paste applied regularly on the scalp before taking bath also reduces hair fall problem.",
    		"7. Durva (dub,a grass used to worship lord Ganesha) paste applied refularly on the scalp before taking bath helps to control hair fall.",
    		"8. Fenugreek paste mixed with Castor oil (Erand) applied regularly before taking bath helps to overcome hair fall problam.",
    		"9. Betel leaves (pan) grinded and mixed with Gingery (Til) oil or Betel leaves(Pan) grinded and mixed with Coconut oil applied on the scalp before taking bath helps to overcome hair fall problem.",
    		"10.Eating Gooseberry (Amla)everyday and applying Gooseberry paste on the scalp regularly before taking bath helps to control hair fall.",
    		"11.Applying Lemon juice on the scalp 10 minutes before bath helps to control hair fall problem.",
    		"12.Soap nut powder used as a hair wash or soap nut leaves paste applied on the scalp before taking bath helps to reduce hair fall problem.",
    		"13.Henna paste (mehendi) mixed with yellow portion of egg or henna paste with lemon juice applied on the scalp regularly before taking bath helps to reduce hair fall.",
    		"14.Beet root leaves grinded with henna leaves applied regularly on the scalp before taking helps to reduce hair fall problem.",
    		"15.Drinking wheat grass juice every morning for one and half month cures hair fall problem.",
    		"16.Basil (tulsi) paste mixed with Gooseberry (Amla) powder applied 10 minutes before taking bath helps to control hair fall problem.",
    		"17.Tea powder boiled in water can be used as a hair wash,which helps in reducing hair fall problem .",
    		"18.Eating Amaranth (Cholayi),Cabbage (patta gobi) regularly helps to overcome hair fall problem.",
    		"19.You can make a hair oil of your own like this. Boil Fenugreek menthi seeds Neem or Sweet neem (Curry patta) leaves Gooseberry (amla),Henna leaves (Mehandi) some Basil (tulsi) leaves in Coconut oil or Gingery oil for 20 minutes in slow flame and store it.Use this regularly to Overcome all hair related problem.",
    		"20.Gram flour (Besan) Mixed with curd or gram flour mixed Milk used as a hair wash helps to overcome hair fall problem.",
    		"21.Applying Crushed raw papaya (Papita) paste on the scalp 10 minutes before taking bath is very helpful.This process assists in the exfoliation of dandruff flakes and slow down fungal Growth.Papaya contains enzyme papain which is very helpful in controlling hair fall.",
    		"22.Massage the scalp frequently with a little almond oil.",
    		"23.Wash hair with the decoction of Neem leaves to stop hair fall. It will not only stop hair fall but it also rejuvenates hair growth."
    	},
    	
    	{
    		"1. Apply coconut oil and wait for 1 hour and take headbath. which will helps to prevent hair loss.",
    		"2. Don't comb your hair after taking head bath, wait till your hair gets dry. So that you will not loose any hair.",
    		"3. Apply Cocunut milk to your hair and wash after some time helps to prevent hair loss.",
    		"4. Apply egg yolk and massage slowly to hair and wait for an hour and wash it.",
    		"5. Hibiscus leaves for hair",
    		"6. Apply Hibiscus plant leaves paste to hair and wait for half an hour and wash it.",
    		"7. Hibiscus flower powder mix with rose water and make it as a paste and apply it to roots of the hair and wait for 30 mins and wash it.",
    		"8. Egg yolk for traction alopecia",
    		"9. Mix egg yolk with henna and apply to hair and wash it when it becomes dry.",
    		"10.Eat protinized food to prevent hair loss. As eating of rich protinized foods not only helps to stop hair loss, but also helps in the growth of healthy hair.",
    		"11.Eat as much as green leafy vegetables to stop hair loss.",
    		"12.Dry-up the Holy Basil (Tulsi) leaves and neem leaves, and make it as a powder and add some water to it and make it as a paste. Apply this paste to hair and wait for 1 hour and wash it.",
    		"13.Don't use soaps or shampoo for head bath. Daily morning having a head bath with cold water helps to improve blood circulation in the head and also helps in giving the proteins to scalp, which resulted good hair growth, strong black hair and stops hair loss problem. This is very natural hair treatment."
    	},
    	
    	{
    		"1. Taking Steam containing Eucalyptus oil drops or decongestant vaporizing ointments like Vicks vaporub, Sensor or only steam helps to get rid of headache due to cold congestion or sinus problems.",
    		"2. Applying Eucalyptus oil on the forehead also helps to relieve headache due to cold.",
    		"3. Equal quantities of Cumin seeds (Jeera), Black pepper (Kali mirch), Coriander seeds (Dhania), Dry ginger (Sonth) powdered. A spoon of this powder boiled in water with Jaggery (Gur) and taken before sleep helps to get relief from head ache due to cold.",
    		"4. Eating a Apple everyday with salt helps to overcome headache.",
    		"5. Cinnamon (Dalchini) grinded with Lemon juice applied on the forehead helps to get relief from head ache.",
    		"6. Dry Coconut chewed with Sugar candy (Mishri) helps to get relief from headache.",
    		"7. Applying Castor oil (Erand ka teil) or Gingery oil (Til oil) or Coconut oil (Nariyal) on the center of the head helps to get relief from head ache.",
    		"8. Tamarind (Imli) mixed in water with Jaggery (Gur), filtered and taken twice a day helps to overcome headache which comes because of heat.",
    		"9. Applying Garlic paste on the forehead relives headache but not to be rubbed as it can cause irritation and burning of the skin. Some peoples skin is more sensitive so in case of any discomfort this remedy can be avoided.",
    		"10.Eating jo (Barley) regularly helps to overcome headache problem.",
    		"11.A Spoon of Tender Neem leaf juice taken everyday helps to over come headache.",
    		"12.pomegranate (Anar) juice with Honey taken for a week helps to get relief from head ache due to mental tensions.",
    		"13.Black pepper grinded with Drumstick (Muranka bhaji) leaves applied on the forehead helps to get relief from headache.",
    		"14.Taking Lemon Tea helps to get relief from headache due to pitta problem.",
    		"15.Applying Ginger paste on the forehead and sleeping covering the body with a blanket helps to get relief from head ache.",
    		"16.Taking raw Onion or Smelling Onion Juice will helps to get relief from head ache.",
    		"17.Black gram (Urad) grinded and applied on the forehead helps to get relief from head ache.",
    		"18.Putting pure Ghee (made from cows milk) drops in both the nostrils regularly helps to cure head ache permanently.",
    		"19.Messaging foot soles with Ghee or Mustard (Sarson) oil in the nights regularly helps to cure head ache.",
    		"20.Boil some Cloves (Laung) with Jaggery (Gur) in water for few minutes, filter it and take this decoction twice a day or just applying Clove paste on the forehead helps to get relief from headache.",
    		"21.Applying diluted Asafoetida (Hing) paste on the forehead gives relief from headache but be careful as it can cause irritation and burn the skin.",
    		"22.Applying Mint juice (pudina) on the fore head helps to get relief from headache.",
    		"23.Cardamom (Elaichi) paste applied on the forehead or smelling Cardamom helps to get relief from head ache.",
    		"24.Drinking Water melon juice or Bael juice helps to relieve from headache due to heat.",
    		"25.Drinking Basil (Tulsi) juice mixed with Lemon juice helps to get relief from head ache.",
    		"26.Drinking Coffee also helps sometimes to get relief from head ache.",
    		"27.Having Lemon juice with Cardamom (Elaichi) powder helps to get relief from headache.",
    		"28.Take frequently fresh juice of ripe Pomegranate.",
    		"29.Soak tamarind pulp in water, squeeze it and knead it well so that the pulp is dispersed completely and dissolves in water. Strain it and to this extracted juice, add a tsp of ginger juice and drink."
    	},
    	
    	{
    		"1. Apply holy basil (Tulsi) leaves juice to scalp for a night and washing in the morning will remove head lice completely. This is very natural home remedy for head lice.",
    		"2. Guava (Amrud) leaves grinded and mixed with Turmeric applied on the scalp 2 hrs before taking bath helps in getting rid of head lice.",
    		"3. Neem leaves grinded and applied on the scalp 2 hours before taking bath helps in getting rid of head lice.",
    		"4. Half spoon of Black pepper (Kali mirch) powder and one cup Curd mixed with two spoons of Lemon Juice applied on the scalp 20 minutes before taking bath destroys head lice completely but remember to close eyes while taking bath as Black pepper can cause irritation to the eyes.",
    		"5. Rubbing a lemon piece on the scalp or applying Lemon juice with Coconut oil before taking bath helps to destroy head lice completely.",
    		"6. Beet root leaves boiled and squeezed and this squeezed water applied on the scalp before taking bath destroys head lice.",
    		"7. Rubbing boiled White goose foot (Bathua leaves) on the scalp 20 minutes before taking bath destroys head lice.",
    		"8. Garlic kills lices as it is pungent. Garlic paste mixed with Lemon juice applied on the scalp before taking bath destroys head lice.",
    		"9. Basil (Tulsi) leaves grinded with neem leaves applied on the scalp before taking bath destroys head lice.",
    		"10.Putting Neem leaves and Basil leaves under the pillow helps to overcome hair lice problem.",
    		"11.You can make your own hair oil like this.: Boil Neem leaves, Basil leaves, Gooseberry (Amla), Cloves (Laung), In Coconut oil and this can be used regularly to avoid all hair related problems."
    	},
    	
    	{
    		"1. Apply cornstarch paste to heal the cold sores.",
    		"2. Mix up some spirits of camphor and dab it on the sore with the help of a cotton ball. This is one of the greatest in healing the cold sores.",
    		"3. Make a salve by grinding up walnuts into walnut butter. This is said to heal a sore in 7 days or less.",
    		"4. Honey is excellent to put on your sore when nothing else works. Honey has been used thousands of years for treating wounds.",
    		"5. Apply a tea bag for 5-10 minutes each hour at the start. Tannic acid present in tea has antiviral properties and helps in preventing the further development of cold sores.",
    		"6. Prepare a paste of baking soda and water. The paste will then be applied over the affected part and left for sometime.",
    		"7. Apply tea tree oil over the scabs with the help of a cotton ball.",
    		"8. On a boiling water, place crushed fresh linseed to create a paste. Put it on the affected area of the skin and cover it with clean cloth.",
    		"9. Cut the lemon in half and place it on the boil.",
    		"10.Combine comfrey with garlic and honey. Apply it on the boil.",
    		"11.Make a paste of cumin seeds, along with water. Apply this paste on the boil and leave overnight.",
    		"12.Turmeric heals boils effectively. Roast a few dry roots of turmeric and dissolves the ashes in a cup of water. After five minutes, apply the solution over affected areas.",
    		"13.Gently warm betel leaves and coat them with castor oil. Spread the leaves on the boil and cover with a bandage. Change the leaves with new ones after every few hours.",
    		"14.Another efficient remedy would be to apply a mixture of 1 tsp milk cream, 1 tsp vinegar and a pinch of turmeric powder, on the boils.",
    		"15.Tea tree oil is thought to minimize scar tissue formation and disinfect the wound.",
    		"16.Salvia leaves are spread on the affected region and are then wrapped by a bandage.",
    		"17.Steep some mullein flowers in olive oil and apply on the affected area. This will result in early recovery of cut wounds.",
    		"18.1Grind a little amount of black coffee and apply it over the cut.",
    		"19.On the bruised portion some lavender oil can also be applied. This gives relief from pain."
    	},
    	
    	{
    		"1. Beautiful and manageable hair need not be seen as an unattainable goal. A very simple rule of thumb is that healthy hair is beautiful hair regardless of type, texture, or color. Below are a few simple and easy tips to promote healthy hair:",
			"2. Try switching to more natural shampoos and conditioners that contain naturally derived cleansers, as these are less likely to strip the hair of its natural oils.",
			"3. Try not over-wash your hair as this can be extremely drying. Most people can get away with washing their hair two to three times a week; however, if you do have oily hair then daily washing with a mild shampoo is often necessary. Just remember that it is the scalp that is oily, not all of your hair so when washing concentrate on the roots. Also remember to replace lost oils by conditioning from the middle of the hair shaft down to the tips.",
			"4. Heat can be very damaging to hair so avoid very hot hair dryers and straightening irons.",
			"5. Avoid the harsh hair chemicals such as chemical perms, bleaches and any treatments or shampoos with harsh synthetic ingredients.",
			"6. Avoid brushing wet hair as this causing hair to stretch and break. When blow dying hair, run your fingers through your hair to dry and style it until it is at least 80 percent dry before styling it with a brush.",
			"7. Smoking has been scientifically shown to cause hair loss which is yet another good reason to kick the habit. If you do smoke, then consider quitting smoking the natural way!",
			"8. Remember that eating poorly, or yo-yo dieting is not only bad for your general health, but it will most often result in dry lifeless hair. Make sure your diet is a healthy and balanced one including lots of fresh fruit and raw vegetables, Omega-3 fatty acids and proteins – all of which are essential for healthy hair growth!",
			"9. Make sure you are getting enough Vitamins A, C, and B.",
			"10.Wash hair with the decoction of Neem leaves to stop hair fall. It will not only stop hair fall but it also rejuvenates hair growth.",
			"11.Neem oil prevents hair from graying and also effective in treating dandruff, lice and hair fall.",
			"12.Apply Neem oil regularly to hair and scalp. It destroys insects in the hair.",
			"13.For dandruff and head lice: Massage neem oil mixed with coconut or olive oil into hair and leave for 1 hour. Shampoo. Repeat once weekly for 3 weeks or as long as problem persists."
    	},
    	
    	{
    		"1. Eating of coriander seeds about 10 to 20 grams is good for heart. Also helps to give instant relief from heart pain within minutes.",
    		"2. 1/2 tsp garlic powder could be taken every day.",
    		"3. Infuse Peepal Tree leaves in water at night, distill it in the morning and store it in white bottles. Administer 15 mg of infusion daily at least three times.",
    		"4. Tamarind lowers cholesterol level in the body and helps in promoting healthy heart."
    	},
    	
    	{
    		"1. Boil peppermint leaves in a bowl of water for 4-6 minutes and strain the leave. Add honey to taste and take a sip of peppermint tea slowly.",
    		"2. Eat fresh Papaya or drink Papaya juice as Papaya is a natural heartburn remedy.",
    		"3. Bananas act as a natural antacid in the body easing heartburn.",
    		"4. Fennel seed is an aromatic herb that helps in digestive conditions through its compound 'Anethole. Chew them half a tea spoon slowly after your meals.",
    		"5. Gradually suck a single piece of clove in mouth after meals.",
    		"6. Papaya chewable tablets can be purchase in health stores and they are helpful reducing heartburn."
    	},
    	
    	{
    		"1. The effective home remedy for hemorrhoids or piles is to Boil 20g of sesame seeds in 500 ml of water and drink it.",
    		"2. It is beneficiary to take the doses of 60-90 ml of white radish juice with a pinch of salt.",
    		"3. The very simple and effective home remedy for hemorrhoids is to make a paste of well-grounded radish with milk and apply over inflamed piles to get relief from pain and swelling.",
    		"4. A cup of milk boiled with mashed banana and taken thrice a day is also beneficial for Hemorrhoids.",
    		"5. Make a fine paste of cumin seeds powder with water and apply to the affected areas to reduce pain. This is one of the simple and effective hemorrhoids treatment.",
    		"6. Cold compress applied to the rectal area for about an hour before going to bed at night is also beneficial for Hemorrhoids to calm down.",
    		"7. A cup of milk boiled with mashed banana and taken thrice a day is also.",
    		"8. Take 3 to 4 Neem leaves with water to get relief from Piles.",
    		"9. Take three grams of inner bark of Neem tree with 6 grams of jaggery every morning with the decoction of Neem leaves."
    	},
    	
    	{
    		"1. Extract the juice from Sida Cordifolia (Chitta Mutti) leaves and apply it on effected area helps to cure herpes. This is very natural home remedy for herpes.",
    		"2. The effective remedy for herpes is rub ice on the herpes for a few minutes. It would provide instant healing effect.",
    		"3. Take some baking powder and pat a cotton ball with it over the infected area. This would be beneficial in treating herpes.",
    		"4. Coat the mixture of 5 drops each of Bergamot oil and eucalyptus oil on the herpes affected area.",
    		"5. Add 25 grams each of dried mullein, mallow roots and marsh mallow roots in 3 liters of water,Simmer it for about 3 minutes. Filter the mixture and use on a compress day and might. This would reduce irritation and also prevent herpes.",
    		"6. Apply the cloth filled with grated carrot on the blisters. It would lessen glandular swelling and alleviate the pain, thereby, providing healing effect.",
    		"7. Take a tea bag and dip it in a cup of hot water. Apply this warm tea bag on the herpes for half an hour."
    	},
    	
    	{
    		"1. Holding breath as much as possible stops Hiccough.",
    		"2. Diverting attention stops Hiccough.",
    		"3. If Hiccough is due to indigestion then taking water with soda helps. Remember not to drink anything hot.",
    		"4. Sucking Sugar or Jaggery (Gue) or Sugar candy (Mishri) or Ginger or Clove helps to cure Hiccough.",
    		"5. Chewing Radish (Muli) leaves gives instant relief from Hiccough.",
    		"6. Chewing Mint (pudina) leaves gives instant relief from Hiccough.",
    		"7. Sucking Lemon piece gives instant relief from Hiccough.",
    		"8. Dry Ginger powder smelled also stops Hiccough.",
    		"9. Eating a spoon of honey gives instant relief from Hiccough.",
    		"10.Drinking Sugar cane (ganna) juice helps to overcome Hiccough.",
    		"11.Drinking a spoon of basil juice (Tulsi) with half spoon of Honey twice a day helps to stop prolonged and regular Hiccough.",
    		"12.Eating a pinch of Asafoetida (Hing) kept inside a Banana fruit pulp of Asafoetida with jaggery helps to stop Hiccough Immediately.",
    		"13.Onion piece of Cinnamon (Dalchini) also stops HICCOUGH Within a moment.",
    		"14.Chewing a piece of Cinnamon (Dalchini) also stops Hiccough within a moment.",
    		"15.Chewing Cardamoms (Elaichi) also stops Hiccough Immediately.",
    		"16.Steam of water Mixed with Black pepper power helps to stop Hiccough.",
    		"17.Taking 2 spoons of Ginger juice with 100 milliliter of Milk helps to stop Hiccough.",
    		"18.A Spoon of pure Ghee heated and taken hot also stops Hiccough.",
    		"19.In 20 milliliter of neem juice, add one forth spoon of Long pepper (pipple) powder with one spoon of Honey and this can be taken 3-4 times a day to cure prolonged and regular Hiccough.",
    		"20.Banyan fruits taken with Honey cures Hiccough.",
    		"21.Mix dry Ginger (Sonth) with Jaggery (Gur) powder and make a small balls like a pea nut and sucking this helps to stop Hiccough.",
    		"22.Equal quantity of Long pepper (pipple) and Dhania (Coriander) powdered. Taking 3 grams of this with a spoon of honey twice a day helps to cure prolonged and regular hiccough.",
    		"23.Taking a spoon of Lemon Juice and a spoon of Honey mixed with a pinch of Black salt stops hiccough. Repeat every 20 mins till Hiccough stops.",
    		"24.Dry Gooseberry (Amla), dry Ginger (Sonth), Long pepper (pipple), Sugar candy (Mishri) all this powdered together and taking 3 grams of this mixture in every two hours helps to stop prolonged and regular Hiccough.",
    		"25.peacock feather can be burnt and smelled stops severe Hiccough.",
    		"26.Dry Banana leaf can be burnt and smelled can stops severe Hiccough."
    	},
    	
    	{
    		"1. Keeping stomach clean, Reducing Salt intake and adequate sleep helps to control High blood pressure.",
    		"2. Eating papaya (papita) everyday morning helps to control high blood pressure.",
    		"3. Sweet neem (Curry patta) used regularly in cooking and drinking Sweet neem juice helps to control high blood pressure.",
    		"4. Eating Beetroot everyday with Lemon juice helps to control high blood pressure.",
    		"5. Drinking Bottle gourd juice ( Ghea) everyday helps to control high blood pressure.",
    		"6. Watermelon helps in controlling high blood pressure. Watermelon seeds helps to widen the capillaries which makes high blood pressure to come down. The Seeds powdered and boiled in water, filtered and this decoction taken helps to control high blood pressure.",
    		"7. Regular Body massage helps to control high blood pressure.",
    		"8. Half cup of Banana stem juice taken twice a day helps to control high blood pressure.",
    		"9. Lemon juice helps to make capillaries flexible. Drinking hot water with lemon juice in the morning helps to overcome high blood pressure problem.",
    		"10.Store water in a cleaned Copper jug overnight and drink a glass of this water in the morning helps to control high blood pressure.",
    		"11.Boiled Joe (barley) taken with buttermilk (Chaach) and Lemon juice regularly helps to control high blood pressure.",
    		"12.Chewing a raw Garlic everyday in empty stomach with a spoon of Honey helps to control high blood pressure problem.",
    		"13.Tinda (Tinda pharsi) helps to increase urine formation and helps to control high blood pressure.",
    		"14.Eating Apple regularly helps to control high blood pressure.",
    		"15.Drinking Ash Goud (petha) juice everyday in the empty stomach helps to control high blood pressure.",
    		"16.Colcasia (Arbi) also helps high blood pressure to come down.",
    		"17.Honey taken regularly helps to make the capillaries active and reduces high blood pressure.",
    		"18.Mint (Pudina) juice taken regularly helps to maintain the blood pressure.",
    		"19.Boiled potato helps to reduce high blood pressure as it contains magnesium in it.",
    		"20.Eating Amaranth (Cholayi) in any form helps to control high blood pressure.",
    		"21.Drinking Tomato juice or eating Tomato regularly in the morning helps to control high blood pressure.",
    		"22.Two spoons of carrot juice taken with a spoon of Spinach (Pa;ak) juice regularly helps to control high blood pressure.",
    		"23.Eating Goose berries (Amla) everyday or eating its murabba helps to control high blood pressure.",
    		"24.Taking a spoon of Triphala (Triphala is composed of Harad (Terminaia chebula, haritaki), Indian gooseberries (Amla) and Behada (bibhitaki)) every day helps to control high blood pressure.",
    		"25.Putting Henna (Mehendi) paste on the head or foot sole which extracts the body heat and control high blood pressure.",
    		"26.3 or 4 cloves of Garlic finely chopped and boiled in milk could be taken everynight."
    	},
    	
    	{
    		"1. Eating Black berries (Jamun) regularly, helps in improving Appetite.",
    		"2. Drinking Coriander (Ddania) juice mixed with water regularly, helps in improving Appetite.",
    		"3. Taking Carom seeds (Ajwain ) and Black salt with hot water, helps in improving Appetite.",
    		"4. Californian Raisin (Munakka), Salt, black pepper (kali Mirch) taken together with hot water, helps to improve Appetite.",
    		"5. Eating a piece of Ginger before meals, helps in improving Appetite.",
    		"6. Eating Raw Cucumber (Kheera),Raw radish (Muli), Raw white Onion, all are helpful in improving Appetite.",
    		"7. Eating Tomato, Amaranth (Red Cjp;aui), Bitter gourd ((karela), Fenugreek (Menthi) regularly, helps in improving Appetite.",
    		"8. Drinking Tamarind (Imli) water mixed with Salt and Black pepper (kali mirch), helps in improving Appetite.",
    		"9. Eating Ber (Zizyphus) fruit regularly, helps in improving Appetite.",
    		"10.Eating Orange with Black salt, helps in improving Appetite.",
    		"11.Drinking sour tasted Apple juice with Sugar Candy (Mishri) for few days, helps to improve Appetite.",
    		"12.Sugar cane (Ganna) juice with Honey, Lemon juice and a pinch of Clove (Laung) powder taken together, helps to improve Appetite.",
    		"13.Sweet Neem (Curry patta), Garlic can be used regularly in cooking, which helps to improve Appetite.",
    		"14.Lemon juice mixed with Ginger juice and Salt taken with water, helps to improve Appetite."
    	},
    	
    	{
    		"1. Daily eating small quantities of Thymol Seeds benefits you in the production of breast milk. This is very useful traditional home remedy to increase breast milk naturally.",
    		"2. Drinking of water mixed with 15 to 20 ml juice extracted from Asparagus racemosus (Satavari) roots helps in the increasing of breast milk supply.",
    		"3. Mixture of deep fried cumin seeds, 5 grams of rock salt and 4 elaichi. Eating of this mixture will helps to increase breast milk. This is one of the easiest homemade home remedy to increase breast milk.",
    		"4. Eating of more garlic added curries with food can helps in the production of more breast milk.",
    		"5. Heating the fresh leaves of Castor oil tree and touching these heated leaves on breast once in every 2 seconds till it lasts its heat. Which helps to increase the production of breast milk. This is very natural home remedy to increase breast milk after delivery.",
    		"6. Dip few Fenugreek seeds (Menthi) in water for few hours, then boil it till the seeds are smooth and this can be taken with Milk after delivery helps to increase breast milk.",
    		"7. Taking the two to three grams of dried Asparagus racemosus (Satavari) roots powder mixed with milk helps to increase breast milk production.",
    		"8. Use of Black gram (Urad) in any form like dal, idli, etc helps in increasing breast milk.",
    		"9. Drinking Carrot juice regularly helps to increase breast milk.",
    		"10.Eating raw Onion along with meals helps to increase breast milk.",
    		"11.Eating Roasted Cumin seeds (Jeera) with Sugar twice a day after delivery helps to increase breast milk.",
    		"12.Eating Grapes also helps to increase breast milk.",
    		"13.Taking boiled Drumstick (Muranka Bhaji) leaves during pregnancy helps to increase breast milk later on.",
    		"14.Massaging breasts with Castor oil (Erand) in the starting weeks of delivery also helps to increase breast milk.",
    		"15.Eating Musk melon (kharbooja) also helps to increase breast milk.",
    		"16.Eating [ea (Mutter) in any form helps to increase breast milk.",
    		"17.Leaves of Touch me not (Lajavanti) plant grinded and applied on the breast helps to increase breast milk.",
    		"18.Grind Shatavari (Asparagus racemosus) root, Mix this paste with Milk and Sugar and filter. Drinking this Milk helps to increase breast milk.",
    		"19.Mukuna wanna or water amaranth (Hingi or Honagonne in Kannada) leaves grinded and 4 spoons of this juice added with 2 spoons of Honey and taken everyday after delivery helps to increase breast milk.",
    		"20.Drinking milk boiled with Cumin seeds (Jeera) and mixed with with Honey, regularly during pregnancy helps to increase breast milk."
    	},
    	
    	{
    		"1. Daily drinking of carrot juice mixed with honey, cow milk and almonds (seema badam) before going to bed is very beneficial for increasing memory power.",
    		"2. Eating 10 grams mixture of Cashew Nut with honey in the morning and evening about 15 days will helps to increase memory power. This is very natural homemade home remedy to increase memory power.",
    		"3. Brahmi (Gotu kola) is said to be very good for brain. Children can take a spoon of brahmi juice and adults can chew 5-6 brahmi leaves everyday to increase memory powder. It is a antioxidant which reduces brain again.",
    		"4. Eating 10 Almonds (Badam) in empty stomach everyday morning helps to increase memory power.",
    		"5. Eating Gooseberries (Amla) or its Murabba everyday morning helps to increase memory power.",
    		"6. Eating a Apple everyday, 15 minutes before meals helps to increase memory power.",
    		"7. Eating Walnuts (Akhrot) regularly helps to increase memory power.",
    		"8. Cinnamon (Dalchini) powder mixed with Honey can be taken everyday to increase memory power.",
    		"9. Drinking Ash Gourd (petha) juice everyday helps to increase memory power.",
    		"10.Drinking hot Milk mixed with Cardamom (Elaichi) power and Honey during night time in everyday helps to increase memory power.",
    		"11.Eating Coriander (Dhania) power mixed with honey before sleep helps to increase memory power.",
    		"12.Eating Raw Fenugreek (Menthi) leaves mixed with small pieces of Radish (Mooli), Salt and Cumin (Jeera) powder also helps to increase memory power.",
    		"13.Eating Cashew nut (Khaju) everyday also helps to increase memory power.",
    		"14.Sesame seeds (Til) are rich in protein and said to be very helpful in increasing memory power. A Sweet ball (laddoo) can be prepared with Sesame seeds and Jaggery (Gur) and taken everyday.",
    		"15.Drinking Wheat grass juice is very good for health and helps to increase memory power.",
    		"16.Mango milkshake (Aam ras) and Honey taken regularly helps to increase memory power.",
    		"17.Eating ginger piece with few Cumin seeds (Jeera) and Sugar candy (Mishri) helps to increase memory power.",
    		"18.Taking Black pepper power with pure butter helps to increase memory power.",
    		"19.Drinking Carrot juice everyday morning helps to increase memory power.",
    		"20.Ghee (prepared from cow milk) messaged on the head and 2-3 drops of pure Ghee put in the nostrils everyday also improves memory power.",
    		"21.Black berry (Jamun) is also very helpful in increasing memory power.",
    		"22.Urad dal (Split horse bean) can be taken with Ragi Rotis also helps in increasing memory power."
    	},
    	
    	{
    		"1. Drinking Luke warm water Mixed with a spoon of pure Honey and a spoon of Lemon juice everyday morning helps to increase resistance powder.",
    		"2. Drinking Milk boiled with a pinch of Turmeric and Black pepper (Kali mirch) every night before going to bed prevents many diseases and also helps to increase resistance power.",
    		"3. Eating a Gooseberry (Amla) Everyday helps to improve resistance power by providing necessary vitamins and iron.",
    		"4. Eating 5 Basil (Tulasi) leaves everyday helps to increase resistance power even for Cancer.",
    		"5. Drinking Milk boiled with Harad (Haritaki) Powder and mixed with a spoon of Honey everyday helps to increase resistance power.",
    		"6. Eating papaya (papita) every helps to increase resistance power.",
    		"7. Betel leaves (pan) with small quantity of Lime (Chuna) and a piece of Arecanut (Supari) taken helps to increase resistance power."
    	},
    	
    	{
    		"1. Eating Cashew nut (Kaju) regularly or eating its sweet will increase weight but avoid its overeating.",
    		"2. Ripe Banana pulp mashed with Milk and Sugar or a Banana with Milk can be taken regularly which helps to increase weight.",
    		"3. Drinking Mango milk shake helps to increase weight.",
    		"4. Drinking Goat milk regularly also helps to increase weight.",
    		"5. Banana flower grinded and this juice taken with Milk also helps to increase weight.",
    		"6. Jo (Barley) without skin boiled with Milk and sugar can be taken everyday helps to increase weight in very few days.",
    		"7. Eating Coconut everyday helps to increase weight.",
    		"8. Boil Dry Dates (Chuara) in Milk and drinking this regularly helps to increase weight.",
    		"9. Eating peas (Mattar) in meals also helps to increase weight.",
    		"10.Eating Groundnut (Moong phali) regularly helps to increase weight.",
    		"11.Regular body Massage helps to increase weight for underweight people.",
    		"12.Eating Black gram (Urad) in anY form helps to increase weight.",
    		"13.Dip few Californian raisin (Munkka) in water and eat them along with water before going to bed or Milk boiled with few Californian raisins, Mixed with Honey can be taken for few days helps to increase weight.",
    		"14.Dip 10 Almonds (Badam) overnight and peel the skin in the morning, add some Butter and Sugar and eat this everyday which helps to increase weight.",
    		"15.Drinking Carrot juice regularly helps in increase weight.",
    		"16.Eat lot of ghee, milk products, sweets etc which helps to increase weight.",
    		"17.Mix boiled Rice with plain Curd in the night and keep it. Eat this in the morning in empty stomach for few days to increase weight which is also good for Eyes and migraine."
    	},
    	
    	{
    		"1. A spoon of Carom seeds (Ajwain) and Black sait taken with hot water reduces indigestion.",
    		"2. Drinking salted Buttermilk everyday helps to reduce indigestion.",
    		"3. Eating a piece of Ginger after every meals helps to prevent indigestion problem.",
    		"4. Lemon juice with Black salt taken with Luck warm water also helps to cure indigestion problem.",
    		"5. Using Garlic or Asafoetida (Hing) meals also helps to to reduce indigestion.",
    		"6. Eating a Banana after every meals helps to overcome indigestion problem.",
    		"7. Eating White grapes regularly helps to overcome indigestion problem.",
    		"8. Eating papaya (papita) everyday also helps to improve digestion and prevents indigestion problems.",
    		"9. Eating Radish with Salt and Black pepper (kali mirch) along with meals also helps in curing indigestion problem.",
    		"10.Equal quantities of Cinnamon (Dalchini), Dry Ginger ( Sonth), Cardamom (Elaichi) powdered, Eating a pinch of this powder helps in curing indigestion.",
    		"11.Eating Orange with Black salt after meals helps to get relief from indigestion problem.",
    		"12.When you are facing indigestion due to drinking plain milk, add a Long pepper (pipple) or Ginger piece (Adrak) or few Cumin seeds (Jeera) while boiling milk.",
    		"13.Drinking Mint (Pudina) juice with Honey every morning helps to overcome indigestion problem.",
    		"14.Eating Drumstick (Muranka Bhaji) in any form helps to reduce indigestion problem.",
    		"15.Drinking a spoon of Honey helps to reduce indigestion.",
    		"16.Makoi leaves and fruits are very good for digestion. Eat them regularly to overcome indigestion problem.",
    		"17.Brinjal (Baingan) especially long one is good for curing indigestion problem.",
    		"18.Eating a Gooseberry (Amla) everyday helps to prevent indigestion problem.",
    		"19.Eating a piece of Jaggery (Gur) after meals helps to overcome indigestion problem.",
    		"20.Drinking a spoon of Basil. (Tulsi) juice helps to overcome indigestion problem.",
    		"21.Boil Asafoetida (Hing) in water and drink it or applying Asafoetida paste on the naval helps in curing indigestion problem.",
    		"22.boil Cloves (Laung) in water and drink it which also helps to prevent indigestion problem.",
    		"23.Sitting in Vajrasan for 5 minutes after every meals in very good for curing indigestion problem.",
    		"24.Applying few drops of Mustard (Sarson) oil inside the naval regularly helps in curing indigestion problem.",
    		"25.Eating aniseeds (Saunf) after every meals helps to cure indigestion problem.",
    		"26.Back berries (Jamun) are very good for digestion. Eat them regularly to Overcome indigestion problem.",
    		"27.Eating Guava (Amrud) with Salt helps in curing indigestion problem.",
    		"28.Taking Roasted Cumin seeds (Jeera) with Honey helps in curing indigestion problem.",
    		"29.Eating Roasted Onion or raw Spring onion (pyaj ka phool) are helpful in curing indigestion problem.",
    		"30.Using Sweet neem (Curry patta) regularly in cooking helps to overcome indigestion problem.",
    		"31.Eating a Cardamom (Elaichi) after meals also helps to overcome indigestion problem.",
    		"32.Eating Sugar cane (Ganna) after meals helps to digest the food and cure indigestion.",
    		"33.Eating Bitter gourd (Karela), White goose foot (Bathua) leaves in any form helps to overcome indigestion problem.",
    		"34.Eating Black pepper (Kali mirch) Powder with Lemon juice and hot water helps to reduce indigestion problem.",
    		"35.Drinking a spoon of raw Potato juice helps to reduce indigestion problem.",
    		"36.5 to 6 Garlic cloves, crushed could be taken with honey once a day.",
    		"37.Tamarind pulp and ripe fruit helps the body digest food.",
    		"38.Add a pinch of salt to tamarind pulp and chew it well for proper digestion."
    	},
    	
    	{
    		"1. Massaging foot sole with mustard (Sarson) oil before going to bed helps to overcome Insomnia.",
    		"2. poppy seeds (khus khus) dipped in water for an hour, grinded to form a paste. Boil this paste with Milk and sugar. Drinking this is very effective to overcome Insomnia.",
    		"3. Eating Mango and drinking Milk or drinking Mango milkshake (Aam ras) regularly in the night helps to overcome Insomnia.",
    		"4. Eating a raw Onion or roasted Onion in the night also helps to get rid of Insomnia problem.",
    		"5. Nut meg (joy phal0 powder mixed with water taken in the night helps to overcome insomnia.",
    		"6. consuming lot of Curd or eating Curd with Sugar or sweet Lassi induces sleep and cures Insomnia.",
    		"7. Drinking hot milk with a spoon of Ghee and sugar in the night helps to get sleep and cures Insomnia.",
    		"8. Drinking a glass of Carrot juice everyday helps to cure Insomnia.",
    		"9. Drinking a spoon of lemon juice mixed with a spoon of Honey in the night induces sleep and cures Insomnia.",
    		"10.Coriander (Dhania) leaves grinded with water and mixed with Sugar and eating this paste helps to get sleep and cures Insomnia.",
    		"11.Aniseeds (Sauf) boiled in water for 10 minutes, add Milk and Sugar. Drinking this before going to bed helps to get rid of Insomnia problem.",
    		"12.Cucumber (kheera) piece rubbed on the foot sole makes a cooling effect on the body and helps to get sleep curing Insomnia.",
    		"13.Putting Castor oil (Erand) on the head or body massaged with Castor oil regularly helps in curing Insomnia.",
    		"14.Sprouted horse gram (Kulthi) taken regularly helps to get sleep and cures Insomnia.",
    		"15.Consuming Dry fruits and Oat regularly helps to cure Insomnia.",
    		"16.Indian gooseberry (Amla) helps to improve the body's immune system by providing necessary vitamins and iron. Eating this everyday helps in curing Insomnia.",
    		"17.Blanched Almonds ground along with 1tsp Khas khas in ½ cup of milk like a paste, could be applied on palms and soles at bedtime."
    	},
    	
    	{
    		"1. Have pomegranate seeds with some black salt. It is beneficiary home remedy for the treatment of Irritable Bowel syndrome.",
    		"2. Simply having rock salt in warm water is one of the simplest home remedies for Irritable Bowel Syndrome.",
    		"3. The efficient home remedy for curing IBS is to have a mixture of one drop of dill oil and a teaspoon of honey after meals.",
    		"4. Take the mixture of 10 grams of soaked Indian gooseberry in water Crush it and add some black salt in it. This mixture helps in reducing IBS related symptoms and discomfort.",
    		"5. Taking peppermint oil in enteric-coated capsules is a tried and tested home remedy to cure Irritable Bowel Syndrome",
    		"6. Boil a cup of water mixed with one teaspoon of flax seeds and drink this solution before going to bed to get rid of Irritable Bowel Syndrome.",
    		"7. Take half a cup of yogurt and mix about one teaspoon of psyllium husks in it. Have this mixture one hour after having dinner.",
    		"8. Rosemary, chamomile, Valerian, lemon balm and other such herbs serve as therapeutic home remedies for IBS treatment.",
    		"9. Take a cup of warm water and add half a teaspoon of dry ginger powder, asafetida and rock salt in it. Have it."
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
    		"1. Mixture of Pudina, Lime and Ginger juice mixed with honey, could be taken frequently.",
    		"2. Soak a piece of Peepal bark in water overnight and consume the water the following morning. It stops excess urination in the jaundice patients.",
    		"3. Decoction of tamarind leaves is useful in treating jaundice and ulcers."
    	},
    	
    	{
    		"1. Use the decoction of Babul tree bark as vaginal douche.",
    		"2. A tablespoon Banyan tree bark powder and fig tree bark powder should be boiled in a liter of water till it is reduced to about half. Douching with the lukewarm decoction will keep the tissues of vaginal tract healthy.",
    		"3. Soak tamarind seeds in water for a day or two and then pound it on a stone slab with milk. Take this paste regularly."
    	},
    	
    	{
    		"1. Taking one cup of tea decoction with banana helps to overcome loose motion problem.",
    		"2. Drinking of water with mixing of 5 to 6 spoons poppy seeds cures loose motion. If you have constant loose motions then you can use this treatment about 3 to 4 times in a day.",
    		"3. Make a 1 - 2 spoons of Curry Leaf Tree leaves paste and add it to half cup of butter milk. BY taking this solution 3 to 5 times a day help to stop loose motion. This is very easy home remedy for loose motions, as curry leaf tree leaves are available in your kitchen.",
    		"4. Breaking of Reetha (Kunkudukai) seeds will get you white gram, now rub these gram on floor will gets you fine form of paste. Now add this paste to water and drink. This will helps you to stop the loose motion problem instantly.",
    		"5. Eating of Baobab tree fruit pulp about 4 grams can helps to stop loose motion or cure Dysentry.",
    		"6. If you are giving 3 grams of Sunnapu Theta water to children will helps to cure loose motion in green color.",
    		"7. Harad (Haritaki) paste is a wonderful remedy for dysentery or loose motion which can be taken 3-4 tines a day.",
    		"8. Pomoegrate (Anar) leaves boiled in water and this water filtered and taken helps to stop dysentery or loose motion.",
    		"9. Beal juice helps in cleaning the stomach and cures dysentery or loose motion.",
    		"10.Drinking water with Lemon juice thrice a day also cures dysentery or loose motion.",
    		"11.Drinking Tea also helps to overcome dysentery or loose motion.",
    		"12.Taking Roasted Cumin seeds (Jeera) with buttermilk (Chaach) also cures dysentery or loose motion.",
    		"13.Eating cooked lady finger (Bendi) helps to cures dysentery or loose motion.",
    		"14.Eating Dates(Khajur) also helps to cures dysentery or loose motion.",
    		"15.Eating boiled Rice with Cured helps to cures in curing dysentery or loose motion.",
    		"16.Fenugreek (menthi) Seeds taken with Butter milk helps in curing dysentery or loose motion.",
    		"17.Apple pieces boiled in milk and taken 3 times a day helps in curing dysentery or loose motion.",
    		"18.Roasted Cumin seeds (Jeera) taken with Honey after meals helps to overcome dysentery or loose motion.",
    		"19.Eating a fully ripe Banana pulp meshed in Buttermilk helps to cure dysentery or loose motion"
    	},
    	
    	{
    		"1. Drinking Beetroot Juice every day helps to control Low blood pressure.",
    		"2. Chewing 4-5 Basil leaves (Tulsi) with a spoon of honey in the morning helps to control low blood pressure.",
    		"3. Dip 5-10 Raisins (Kishmish) overnight in water. Eat Raisins with water in the morning which helps to control Low blood pressure.",
    		"4. Dip 10 Almonds (Badam) in water overnight, remove the skin in the morning. Eat these almonds empty stomach which helps to control Low blood pressure.",
    		"5. Mint (Pudina) juice helps in controlling blood pressure. Drinking Mint juice regularly helps to cure Low blood pressure problem.",
    		"6. Tulsi juice mixed with honey could be taken."
    	},
    	
    	{
    		"1. Boil Cinnamon (Dalchini) and Black pepper (Kali Mirch) in water and filter. Drink this hot decoction mixed with Honey, which reduces fever and chills during Malaria.",
    		"2. Boil Orange skin in water for 20 minutes and filter. Drink this hot decoction, which is helpful during Malaria.",
    		"3. Basil (Tulsi) leaves rubbed on the body reduces chills during Malaria.",
    		"4. Drink one spoon of Lemon juice with one spoon of Onion juice thrice a day, which reduces fever during Malaria.",
    		"5. When fever repeats every fourth day during Malaria, drinking Lemon Juice in water with sugar daily, reduces fever.",
    		"6. A lemon piece filled with Salt and Black pepper can be heated and sucked slowly, twice a day, which is helpful during Malaria.",
    		"7. When fever repeats every fourth day during Malaria, drinking Buttermilk (Chaach) helps in fast recovery.",
    		"8. Eating Banana, Guava (Amrud), Apple during Malaria helps in fast recovery.",
    		"9. Equal quantities of coriander (Dhania) powder and Dry ginger powder (Saunth) can be mixed, eating a spoon of this mixture thrice a day with water helps to reduce fever during Malaria",
    		"10.Tale long pepper (pipple) powder mixed with Honey, which reduces fever during Malaria.",
    		"11.Boil Neem leaves a Black pepper (kali Mirch) in water and filter. Drinking this decoction helps to cure Malaria.",
    		"12.Boil Basil (Tulsi) leaves and Black pepper powder in water and filter. Drinking this decoction helps to cure malaria.",
    		"13.Boil one spoon of Black pepper powder, three Garlic cloves in one cup of water and filter. Drinking this (after cooling) with a spoon of honey, thrice a day helps to cure Malaria.",
    		"14.Water, in a mud pot, soaked with Nirgundi leaves, to which ½ tsp black cumin seeds are added could be taken.",
    		"15.Take the decoction of fresh Neem leaves. It should be taken in doses of 15 to 60 grams.",
    		"16.Make herbal tea using tamarind leaves and drink. It reduces the effect of Malaria."
    	},
    	
    	{
    		"1. Eating a pinch of Asafoetida (Hing) kept inside a Banana fruit pulp or Asafoetifa with jaggery and drinking hot water helps to reduce stomach ache during menstruation.",
    		"2. Eating a spoon of Fenugreek seeds (Menthi) with a cup of Buttermilk (Chaach) helps to reduce stomach ache during menstruation.",
    		"3. Eating Black Sesame seeds (Til) powder with hot Milk during menstruation helps to get relief from stomach ache.",
    		"4. Putting a wet cloth on the naval area cools the stomach helps to reduce stomach ache during menstruation.",
    		"5. Dry Ginger (Sonth) and jaggery (Gur) boiled in water, filtered and drinking this decoction helps to reduce stomach ache during menstruation.",
    		"6. Drinking Half spoon of neem leaf juice mixed with one fourth spoon of Ginger juice helps to reduce stomach ache during menstruation.",
    		"7. Mustard seeds powdered and boiled in water. A cloth dipped in this hot solution can be put on the stomach which helps to reduce stomach ache during menstruation.",
    		"8. Eating Carom seeds (Ajwain) and jaggery (gur) with pure Ghee helps to reduce stomech ache during menstruation.",
    		"9. Aniseeds (Saunf) boiled in water, filtered and drinking this decoction with a spoon of Honey helps in reducing stomach ache during menstruation.",
    		"10.Guava fruit (Amrud) pulp without seeds mixed in Milk with honey, taken reduces stomach ache during menstruation.",
    		"11.Eating Radish and Radish leaves helps in controlling stomach ache during menstruation.",
    		"12.Black Cotton leaves grinded and mixed with Milk, drinking this milk helps in reducing stomach ache during menstruation.",
    		"13.Powder the tender roots of Banyan tree and mix it with 5 times its weight, with milk, and take at night for 3 consecutive nights."
    	},
    	
    	{
    		"1. Mix plain Rice with Curd in the night and keep it overnight. Eat this rice in the morning in empty stomach for some days to sure Migraine.",
    		"2. Massage head with Castor oil (Erand) and put a wet cloth on the forehead, both helps to get relief from Migraine pain.",
    		"3. Eating a spoon of Honey with half spoon of salt or just eating Honey or putting Honey in nostrils all helps to cure Migraine pain.",
    		"4. Eating Jaggery (Gur) Mixed with pure Ghee, (Ghee prepared from cow milk) in the empty stomach for 5 days to helps to cure Migraine.",
    		"5. Eating Goose berries (Amla) with Salt gives relief from Migraine.",
    		"6. Eating Apple pieces with Salt for 3 weeks helps to get permanent relief from Migraine.",
    		"7. Apply diluted Asafoetida (Hing) paste on the forehead and try to inhale its smell, to get relief from Migraine. Don't rub it as it can cause skin irritation.",
    		"8. Mustard (Sarson) oil drops put in the nostrils ( If you are having left side pain put in the right nostril & vice verse ) for few months helps to get permanent relief from Migraine.",
    		"9. A few drops of Ghee prepared from cow milk put in the nostrils ( If you are having left side pain put in the right nostril & vice verse) for few months helps to get permanent relief from Migraine.",
    		"10.Drinking a spoon of Basil (Tulsi) juice mixed with Honey helps to get relief from Migraine.",
    		"11.Eating some sweet, Sugar or jaggery during Migraine reduces pain in some people instantly.",
    		"12.Chewing some black pepper (kali mirch) with pure Ghee (Ghee prepared from cow milk) helps to get relief from Migraine.",
    		"13.Dry Ginger (Sonth ) Mixed in water can be smelled and applied on the forehead (avoid rubbing) reduces Migraine pain.",
    		"14.Putting Drum stick leaves (Muranka Bhaji) juice in the nostrils (If you are having left side pain put in the Right nostril & vice versa) gives relief from Migraine.",
    		"15.Smelling Onion juice or chewing raw Onions helps to get relief from Migraine pain.",
    		"16.5 drops of Drum stick leaf juice and Ginger juice equally mixed and filtered can be put in the ear (If you are having left side pain put in the Right ear & vice verse) to get relief from Migraine pain.",
    		"17.putting few drops of Almond (Badam) oil in the nostrils for some days helps to get permanent relief from migraine."
    	},
    	
    	{
    		"1. Gargling with coriander decoction will give instant relief from mouth ulcer and teeth pain.",
    		"2. Brushing with Indian beach (Kanuga) tree will cure mouth ulcer and all types of teeth problems very effectively.",
    		"3. Eating of coconut is a very good treatment for mouth ulcer.",
    		"4. Gargling with juice extracted from dates flower (karjurapu puvvu) or coconut flower (kobbari puvvu) or wild date flower (eetha puvvu) or palm fruit flower (tati puvvu) will give instant relief from mouth ulcer.",
    		"5. Gargling with gorintha akula decoction will cure mouth ulcer, stomatitis, sore mouth and eruption in the mouth.",
    		"6. Applying the tella maddi churnam with oil will give relief from mouth ulcer.",
    		"7. Gargle with decoction made from pomegranate tree roots will cures mouth ulcer immediately.",
    		"8. Gargle with babool black (nalla tumma) tree decoction is a very good remedy for mouth ulcer.",
    		"9. Gargle with candy sugar (patika bellam) water.",
    		"10.Gargling with complete Land – Caltrops juice mixed with honey will cures mouth ulcer as well as foulness of the breath.",
    		"11.Gargle with milk of banyan tree cure mouth ulcer.",
    		"12.Gargle with metta tamara leaves juice or decoction cures mouth ulcer and stomatitis.",
    		"13.Gargling with juice made from raw elephant apple or wood apple extract will cure mouth ulcer.",
    		"14.Chewing and eating of Poppy Seeds about three to four days helps to reduce over heat in the body and also cures mouth ulcer.",
    		"15.Chewing and eating of common Jasmine leaves helps to cure mouth ulcer. This is one of the very useful and natural remedy mouth ulcer.",
    		"16.Make a decoction with the help of Common Jasmine leaves about 20 to 25. Gargling of this decoction will helps to give instant relief from mouth ulcer.",
    		"17.Applying Honey or pure Ghee or Glycerin or the bubbles helps to cure Mouth ulcer faster.",
    		"18.Eating banana mixed with Curd in the morning gives instant relief from Mouth ulcer.",
    		"19.Slowly chewing Valli leaf ( Basale soppu in kannada) gives a quick relief from Mouth ulcer.",
    		"20.Eating a raw Tomato or washing mouth with Tomato juice helps to cure Mouth ulcer.",
    		"21.Durva (Dub, a grass used to worship Lord Ganesha ) boiled in water, filtered and this decoction used as a mouth wash cures mouth ulcers.",
    		"22.Washing mouth with warm Bitter gourd ( karela ) juice mixed with a pinch of Plum powder (phitkari) or only Bitter gourd juice, gives relief from Mouth ulcer.",
    		"23.Warm water mixed with Salt and Lemon juice used as a mouth wash helps to get relief from Mouth ulcer.",
    		"24.Tender Guava (Amrud) leaves boiled in water with Salt and filtered. This decoction used as a mouth wash cures Mouth ulcer.",
    		"25.Gooseberry (Amla) leaves boiled in water and filtered. Washing mouth with this decoction helps to cure Mouth ulcer faster.",
    		"26.Harad (Haritaki) powder mixed with Honey applied on the bubbles helps to cure Mouth ulcer.",
    		"27.Chewing poppy seeds (khus khus) with dry Coconut or dry Coconut with Sugar candy (Mishri) helps to get relief from Mouth ulcer.",
    		"28.Camphor (karpoor) with pure Ghee can be applied on the bubbles and washed later. This can be done 2-3 times a day to get relief from Mouth ulcer.",
    		"29.Chewing Henna (Mehendi) leaves, or Henna leaves boiled in water and filtered, and use of this decoction as a mouth wash, helps in curing Mouth ulcer.",
    		"30.Boil Turmeric power in water and this warm decoction used as a mouth wash helps in curing Mouth ulcer.",
    		"31.pomegranate (Anar) skin boiled in water, filtered and this decoction used for washing mouth gives a great relief from Mouth ulcer.",
    		"32.Take juice of the root bark of Peepal tree. It heals ulcers and enhances granulation."
    	},
    	
    	{
    		"1. Take leaves of Peepal tree and smear them with ghee, warm over the flame and bandage over the inflamed part to get relieve from Mumps."
    	},
    	
    	{
    		"1. Cucumber puree when applied on the hairs for 15 minutes provides natural shine and makes them healthier.",
    		"2. Regular washing of hairs with white vinegar helps in maintenance of normal hairs.",
    		"3. Applying overnight soaked fenugreek seed on hairs and leave it for one hour. Rinse of the hairs and then shampoo them with mild shampoo.",
    		"4. Mix two egg yolks in a glass of hot water. Soak your hairs in the solution and massage it on the scalp and then rinse off it with warm water.",
    		"5. Gentle massage of olive oil or almond oil is very effective way to support dry hairs from losing.",
    		"6. A table spoon of gram flour is added to coconut milk and is applied on the scalp and gently massaged. After wards rinse off the paste. This method should be performed once a week.",
    		"7. Mint is boiled in water for about 2o minutes. Strain the mixture and the residue is mixed with the herbal shampoo and is used in washing the hairs.",
    		"8. Put half pound of dried powder of reetha, shikakai and amla in about one liter of water. Remain it soaked for few hours and then boil the mixture and on cooling use it as a shampoo.",
    		"9. Grind fenugreek seeds with water and apply on the head. Leave for at least 40 minutes before washing. Continue it for a month.",
    		"10.Rub of the scalp with fingers after washing the hair with cold water. It is a good home remedy for treat hair loss.",
    		"11.Prepare a home made shampoo by adding 5 tbsp of curd, 1 tbsp of lemon juice and 2 tbsp of gram raw (chholia) powder. Apply it on the head for an hour and then wash.",
    		"12.Massage almond oil on scalp 2-3 times a day, daily. This will stop further hair loss.",
    		"13.Apply a paste of hot olive oil, honey, and 1 teaspoon cinnamon powder before bath and keep for 15 minutes.",
    		"14.Grind half a cup of black dal lentil with one tablespoon of fenugreek seeds (dana methi) to a coarse powder. Mix well half a cup of yogurt into the powder and message over the scalp. Leave for 2 hours then rinse.",
    		"15.Wash hair with the decoction of Neem leaves to stop hair fall. It will not only stop hair fall but it also rejuvenates hair growth.",
    		"16.Neem oil prevents hair from graying and also effective in treating dandruff, lice and hair fall."
    	},
    	
    	{
    		"1. putting a piece of Ice (Baraf) on the head or putting a wet cloth on the head is a good remedy to stop nose bleeding or Epistaxis.",
    		"2. Putting a drop of Lemon juice in both the nostrils, helps to stop nose bleeding or Epistaxis immediately.",
    		"3. Lie down putting your head backside with some pillows and then put 2-3 drops of pure Ghee in the nostrils and try to inhale slowly which helps to stop nose bleeding or Epistaxis.",
    		"4. putting Onion Juice drops in the nostrils, helps to stop nose bleeding or epistaxis.",
    		"5. Putting Neem juice drops in the nostrils, helps to stop nose bleeding or epistaxis.",
    		"6. Smelling Cow dung, helps to stop nose bleeding or epistaxix.",
    		"7. Drinking Durva (Dub, a grass used to worship Lord Ganesh) juice mixed with Sugar, stops nose bleeding or Epistaxis.",
    		"8. Black Cotton leaves grinded and squeezed to extract juice, this juice applied on the center of the head,stops nose bleeding or Epistaxis.",
    		"9. putting Sweet grape juice in the nostrils, helps to stop nose bleeding or Epistaxis.",
    		"10.Use of Gooseberry (Amla) is a good remedy to cure nose bleeding or Epistaxis. Drinking Gooseberries juice with water or applying Gooseberries paste on the center of the head or Gooseberries juice put in the nostrils, all are helpful to stop nose bleeding or epistaxis.",
    		"11.Putting pomegranate (Anar) juice in the nostrils, stops nose bleeding or Epistaxis.",
    		"12.Putting Basil (Tulsi) juice in the nostrils, cures nose bleeding or Epistaxis.",
    		"13.Eating a piece of Coconut everyday in the empty stomach, helps to overcome nose bleeding or Epistaxis.",
    		"14.Black gram (Urad dal ) grinded with water and this paste applied on the forehead, helps to stop nose bleeding or existaxis.",
    		"15.Drinking Ash Gourd (petha) juice Everyday keeps the body cool and stops nose bleeding or Epistaxis.",
    		"16.Dip 2 Figs (Anjeer) in water overnight. Eating them with water in the morning, helps to overcome nose bleeding or Epistaxis problem.",
    		"17.Drinking milk with a spoon of pure Ghee, helps to stop nose bleeding or Epistaxis."
    	},
    	
    	{
    		"1. Avoid fried items, sweets, chocolates, ice creams, ghee, oil etc. Eat healthy foods like fruits, vegetables, sprouts etc to avoid Obesity.",
    		"2. Doing regular exercise like long walk in the morning and evening, yoga and other physical exercise will reduce extra accumulated fat thereby reducing obesity.",
    		"3. Drinking a glass of hot water with a spoon of Lemon juice and a spoon of Honey in the morning is a good remedy for fighting Obesity.",
    		"4. Butter gourd juice (Karela) taken in the morning can do wonders in case of Obesity by reducing excess fat considerably.",
    		"5. Eating raw tomatoes and Onion with a pinch of Salt everyday helps to remove extra fat and reduce obesity.",
    		"6. Eating ten raw Sweet neem (Curry patta) leaves everyday, reduces fat and Obesity.",
    		"7. Eating Radish (Mooli) daily, helps to reduces fat and Obesity.",
    		"8. Substitute Rice and wheat with Ragi, which helps to reduces fat and Obesity.",
    		"9. Chewing Garlic everyday in the empty stomach with a spoon of honey, helps to reduces fat and Obesity.",
    		"10.Massaging the body at least once in a week, also helps to reduce Obesity.",
    		"11.Easting or taking only fruit diet one day in a week also helps to reduce Obesity.",
    		"12.Drinking Ash gourd (petha) juice regularly, helps to reduces fat and Obesity.",
    		"13.Eating Triphala powder (Triphala is composed of Hard (Haritaki), India gooseberries (Amla) and Behada (Bibhitaki)) every night before going to bed, helps to reduces fat and Obesity.",
    		"14.Taking Steam bath once in a week, helps to reduces fat and Obesity.",
    		"15.Drinking a spoon of Cow urine everyday morning, helps to reduces fat and Obesity.",
    		"16.Eating Drumstick (Muranka Bhaji) or Drumstick leaves regularly in meals, helps to reduces fat and Obesity.",
    		"17.Banana grinded in Milk and mixed with a spoon of Banana floser Juice. Taking this for 80 days will definitely reduce weight and cures Obesity.",
    		"18.Eating Cucumber (Kheera) daily helps to reduces weight and Obesity.",
    		"19.Drinking Buttermilk (Chaach) everyday helps to reduce weight and Obesity.",
    		"20.Eating raw Cabbage (patta gobi) everyday helps to reduce weight considerably and Obesity.",
    		"21.Drinking Spinach (palak) juice with Lemon juice regularly helps to reduce weight and Obesity."
    	},
    	
    	{
    		"1. For pains in the legs and hands: Heat the camphor with some good oil and applying this mixture on the pains in the legs and hands will give instant relief from pains. This is a very good home remedy for pain at home. Give a light massage with coconut oil before going to sleep will give pain relief in the morning. Take a hot water and dip the plain cloth in it. Now giving some pressure with this hot cloth will give instant relief from pains in the joints, legs and hands.",
    		"2. For pains in the joints or knees: Heat the human urine and wetting leg fingers with this portion will give relief from pains. Tieing the bone of dead human being to the leg fingers of who have pains in feet will cure pains. Collect the oil by cooking the bat's meat. Applying this oil helps to cure pains in the joints and waist. Give a light massage with castor oil and tieing the knee pains area with heated castor oil tree leaves with a cloth will cure knee pains. Applying the paste made with the help of tobacco",
    		"3. For pains from cold or atrabilis:Make a fine form of paste by rubbing the tobacco on floor and applying this paste on pains will cure pains from cold or atrabilis. Massaging with fat of the wild hog on pain area will cure pains from cold or atrabilis. Make a paste with roots of drumstick tree and mustard seeds. Tieing with a plain cloth with paste on pain area will cure pains from cold or atrabilis. Massaging with sand oil will cure pains. Tieing with Machi Patri will remove pains from cold or atrabilis. Drinking of 50 to 60 grams of decoction made from Parijatham leaves will cure pains.",
    		"4. Colic or Stomach Pain:Taking 12 to 20 drops of oil made from lemon grass will cure stomach pain, which is oftenly giving pain in the stomach. Taking of Indian plant Sampenga tree leaves juice with honey will give instant relief from colic or stomach pain. Make a scratch with a knife to the papaya, you will get some milk. Taking this milk by mixing of some water will cure stoamch pain immediately. NOTE: Pregnant women should not use this home remedy as the drinking of papaya milk may result abortion.",
    		"5. For Pain in the shoulder blade: Heat the Indian red wood (which have black flowers) tree leaves in castor oil and tieing these leaves on pain area will cure pain in the shoulder blade."
    	},
    	
    	{
    		"1. Radish (Muli) is very helpful in curing piles. Regularly eating raw Radish or drinking Radish juice with a spoon of ghee, helps to reduce piles problem.",
    		"2. Drinking a spoon of Ginger juice mixed with 2 spoon of Mint (pudina) juice and 4 spoons of Honey 3 times a day, helps in curing piles.",
    		"3. Equal quantities of Haritaki (Harad), Loan pepper (pipple) ,sugar candy (Mishri) posdered, and half spoon of this posder taken with Butter, both in morning and evening, for some days helps to sure piles.",
    		"4. Taking 10 milliliter of Onion juice mixed with a spoon of Sugar for 15 days, helps in curing piles.",
    		"5. Drinking Aloe Vera (Gwar patha) juice for few days, helps in curing piles.",
    		"6. Elephant foot com (jimi kand) pieces powdered and 5 grams of this posder taken with Ghee, Honey and jaggery (Gur) or taken with Buttermilk for few days, also sures piles.",
    		"7. Eating boiled Raw Banana without skin regularly, helps to cure piles.",
    		"8. Eating onion pieces with Jaggery (Gur) or eating spring onions (pyaj ka Phool) are very good for piles.",
    		"9. Drinking Butter milk with a half spoon of Turmeric powder helps in curing piles.",
    		"10.Drinking sweet neem (Curry patta) juice with Honey or Sweet neem juice with Buttermilk helps to cure piles.",
    		"11.Eating raw Bitter gourd (Karela) or drinking Bitter gourd juice helps to cure piles.",
    		"12.Regularly eating Dating Dates (Khajur) helps to cure piles.",
    		"13.Eating a spoon of Neem seed powder with Honey everyday, helps to cure piles.",
    		"14.Eating a spoon of Roasted Sesame seeds (Til) with Jaggery ((Gue) for few days, helps to cure piles.",
    		"15.Eating papaya (papita) everyday helps to cure piles.",
    		"16.Using Banana stem regularly in cooking is bebeficial in piles.",
    		"17.Eating Black berries (Jamun) or drinking Black berries juice with Honey helps to sure piles.",
    		"18.Eating 4-5 Neem flosers with Sugar candy (Mishri) in empty stomach for few days, helps to cure piles.",
    		"19.Eating cabbage (patta gobi) is also very beneficial in curing piles.",
    		"20.Eating Colcasia (Arbi) is also helpful in curing piles.",
    		"21.The effective home remedy for piles or piles is to Boil 20g of sesame seeds in 500 ml of water and drink it.",
    		"22.It is beneficiary to take the doses of 60-90 ml of white radish juice with a pinch of salt.",
    		"23.The very simple and effective home remedy for piles is to make a paste of well-grounded radish with milk and apply over inflamed piles to get relief from pain and swelling.",
    		"24.A cup of milk boiled with mashed banana and taken thrice a day is also beneficial for Piles.",
    		"25.Eating of cumin seeds powder mixed with turmeric helps to remove piles. This is very easy home remedy for piles treatment.",
    		"26.Make a fine paste of cumin seeds powder with water and apply to the affected areas to reduce pain. This is one of the simple and effective piles treatment.",
    		"27.Cold compress applied to the rectal area for about an hour before going to bed at night is also beneficial for piles to calm down.",
    		"28.A cup of milk boiled with mashed banana and taken thrice a day is also.",
    		"29.Take 3 to 4 Neem leaves with water to get relief from Piles.",
    		"30.Take three grams of inner bark of Neem tree with 6 grams of jaggery every morning with the decoction of Neem leaves.",
    		"31.Take the mixture of milk and few drops of latex of Banyan tree daily with out fail. This helps in curing bleeding piles.",
    		"32.Fry tamarind leaves in oil and ghee and cook in sufficient quantity of curd. Add powder of dried pomegranate, coriander (dhaniya) seeds and dried ginger to it and take internally.",
    		"33.Extract juice from Tamarind flowers and take it regularly, it treats piles effectively."
    	},
    	
    	{
    		"1. Garlic is said to be very good for pneumonia. 5 drops of garlic juice in 2 spoons of hot water should be taken during pneumonia.",
    		"2. Applying external heat to chest, by hot water bag or heated salt tied in a cloth,makes the breathing easier during pneumonia.",
    		"3. Taking a [ounce] pf Asafoetida (Hing) in warm water gives relief furing Pneumonia.",
    		"4. Boil few basil leaves with Black pepper (Kali Mirch) in water and filter. Drinking this decoction helps in pneumonia.",
    		"5. Drinking Honey mixed with warm warm water during pneumonia gives strength and helps for easy digestion.",
    		"6. In case of excessive wheezing sound during pneumonia, Boil five whole Black peppers with five Californian raisin (Monakka) in water for some time and filter. A spoon of this decoction taken thrice a day helps to reduce Phlegm (Balgam)."
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
    		"1. Washing the affected parts with discarded water during washing Rice, gives relief from prickly heat.",
    		"2. Brinjal (Baingan) pieces dipped in water for some hours. This water used to wash the affected area gives relief from prickly heat.",
    		"3. Taking bath only with cold water also helps to get relief from pricklu heat.",
    		"4. Applying Henna paste (Mehendi) gives a quick relief from prickly heat.",
    		"5. Massaging the body with gingery (Til) oil, Also helps to get relief from prickly heat problem.",
    		"6. Fenugreek seeds (Menthi) dipped in water and later grinded with coconut to form a paste. Applying this paste on the whole body and head half an hour before taking bath, gives relief from prickly heat.",
    		"7. Applying Harad (Haritaki) powder mixed in water on the body before taking bath, helps to get relief from prickly heat.",
    		"8. In stead of using soap go for Soap nut (Shikakai) or Gram flour (Besan) which helps in controlling prickly heat.",
    		"9. Applying Goose berry (Amla) paste on the affected parts, gives relief from prickly heat.",
    		"10.Applying Bitter gourd (Karela ) Juice Mixed with small quantity of eating soda on the affected parts, gives relief from prickly heat."
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
    		"1. Rubbing Rock salt (Saindha namak) mixed with Mustard (Sarson) oil on the teeth regularly helps to cure pyorrhea.",
    		"2. Drink lot of Orange juice and Carrot juice regularly to cure pyorrhea.",
    		"3. Tender Mango leaves boiled in water and filtered and this decoction used as a mouth wash regularly cures pyorrhea.",
    		"4. Regularly Rubbing Camphor (Kapoor) Mixed with Castor oil (Erand) on the gums twice a day helps to cure pyorrhea.",
    		"5. Chewing raw Spinach (Palak) and drinking spinach juice regularly, helps to overcome pyorrhea.",
    		"6. Cardamom (Elaichi) boiled in water and filtered, and this decoction regularly used as a mouth wash cures pyorrhea.",
    		"7. Orange skin dried and powdered and this powder regularly rubbed on the teeth helps to cure pyorrhea.",
    		"8. Regularly applying mixture of lemon juice and Honey on the teeth cures pyorrhea.",
    		"9. Regularly applying Sandal wood paste on the teeth helps to cure pyorrhea.",
    		"10.Chewing lettuce leaves everyday after meals helps in preventing pyorrhea.",
    		"11.Chewing unripe Guava (Amrud) is good for teeth and gums. Chewing tender guava leaves helps to cure bleeding gums. Guava root bark boiled in water and filtered, and this decoction used as a mouth wash cures swollen gums."
    	},
    	
    	{
    		"1. Use the latex of Banyan tree. It is proved effective for Rheumatism.",
    		"2. use the milky juice from the banyan tree to massage the joints as it relieves swelling and rheumatic pain."
    	},
    	
    	{
    		"1. Apply the Mustard seeds paste on the area of scorpion sting or scorpion bite will helps to remove poison. This is instant home remedy for scorpion bite.",
    		"2. Make a fine form of paste with Holy Basil (Krishna Tulsi) roots and apply on it. This will helps to remove poison from your body instantly. This is one of the traditional home remedy for scorpion bite, which is used by our elders in earlier days.",
    		"3. Applying Radish (Mi;i) Paste mixed with salt on the affected area and eating Radish helps in reducing the effect of scorpion bite.",
    		"4. Applying Onion juice on the affected area helps in reducing the effect of scorpion bite.",
    		"5. Applying basil (Tulsi) leaves grinded with Salt on the affected area helps to reduce the pain during scorpion bite.",
    		"6. Applying garlic paste on the affected area and drinking a spoon of garlic juice with Honey helps in reducing pain and burning during scorpion bite.",
    		"7. Lemon seeds grinded and applied on the affected area gives relief from the burning and the pain during scorpion bite.",
    		"8. Applying Mint (Pudina) paste on the affected area and drinking Mint juice during scorpion bite is beneficial.",
    		"9. Applying Bottle gourd (Ghea) paste on the affected area and drinking Bottle guard juice helps in removing poison of scorpion bite.",
    		"10.Carom (Ajwain) seeds grinded and applied on the affected area reduces the burning and the pain during scorpion bite.",
    		"11.Applying Apple paste on the affected area and eating Apple during scorpion bite is very helpful.",
    		"12.pomegranate (Anar) leaves grinded and this paste applied on the affected area of scorpion bite is very helpful.",
    		"13.Alum (phitkari) dissolved in water and applied on the affected area of scorpion bite is very helpful.",
    		"14.Tamarind (Imli) seeds crushed into pieces and dipped in water for sometime. These swollen seeds lightly pressed still it sticks, to the affected area of scorpion bite. These seeds will fall down itself after sometime after removing poison from the wound.",
    		"15.Grind dried Ash gourds (petha) stalks with water to make a paste. Apply this paste on the affected area and heat the area with hot water bottle, it helps in removing poison as well as reducing pain due to scorpion bite."
    	},
    	
    	{
    		"1. Apply wet dressing to soothe the burning sensation.",
    		"2. Apply the paste of two powdered aspirin tablets mixed with 2 tbsp of chloroform or alcohol to the affected area.",
    		"3. Make a solution by mixing aloe vera gel, raw honey and leek juice and apply it to the affected area.",
    		"4. As a cold compress you can apply baking soda and water solution.",
    		"5. Apply a mixture of yogurt and zinc oxide along the particular path of the nerve. If it is applied before the outbreak it would help to curb the outburst of blisters.",
    		"6. Make a solution by mixing 1/2 cup of apple cider vinegar in 2 cups of water. Use a cotton cloth to moisten the affected areas by using the upward movement, this will relieve you from shingles.",
    		"7. Applying a combination of raw honey, aloe vera gel and leek juice is one of the most effective natural home remedies for Shingles rash.",
    		"8. Mix one teaspoon of parsley juice in some celery and carrot juice and apply this mixture on the affected areas as an efficient natural remdy for Shingles rash and pain.",
    		"9. Pear fruit also work as natural antiviral medicine. It serves as a safe Shingles home remedy, either in the form of fruit or juice."
    	},
    	
    	{
    		"1. A few drops of either in hot water are good to inhale.",
    		"2. Drinking water is a very good sinus infection treatment. Take the pain of drinking a 10 glasses of water a day.",
    		"3. Mix 2 teaspoons of apple cider vinegar with a glass full of warm water. Drink the mixture and repeat is about 2-3 times a day.",
    		"4. Add a few drops of eucalyptus oil to a bowl of hot water. Bow down your head and inhale the steam for 10 minutes for 2-3 times a day.",
    		"5. Chop fresh garlic and add it to a bowl of hot water for inhaling its steam 2-3 times in a day.",
    		"6. Put some mustard sees powder in water and prepare a decoction by boiling it. Putting it in the nostrils brings relief.",
    		"7. Make a paste of cinnamon and water and apply it on the forehead.",
    		"8. The paste of basil leaves, cloves and dried ginger, when applied on the forehead relieves sinus infection.",
    		"9. Take 1 cup tomato juice and add 1 tsp chopped fresh garlic, ½ tsp hot sauce, 1 tsp lemon juice and a pinch of salt. Put the juice in a pan and heat it. Drink hot.",
    		"10.Use pure neem oil as nasal drops to get relief from Sinus problems."
    	},
    	
    	{
    		"1. Use natural home made herbal bath powder for bath. Which will helps to get rid of skin problems and helps to maintain good skin.",
    		"2. Daily applying the paste made from outer bark of apple tree on skin can helps to clear all types of skin problems in very short span of time.",
    		"3. Use clean and dry towel to every bath, it will prevents skin related problems or skin diseases.",
    		"4. For complete skin protection make a strong tea with neem leaves and add to the bath along with a little rose water."
    	},
    	
    	{
    		"1. One Castor leaf (Erand) and 10 whole Black peppers (kali mirch) grinded together and given immediately, causes vomiting and removes poison of the snake bite from the body. Repeat it number of times.",
    		"2. Drinking Banana stem is very effective remedy to remove poison from the body due to snake bite.",
    		"3. Chewing Neem leaves with salt and Black pepper (kali Mirch) is helpful in removing poison of snake bite. If it tastes sweet. It is an indication of presence of poison in the body, and if it tastes bitter it indicates the absence of poison in the body.",
    		"4. Taking grinded Basil (Tulsi) leaves with water helps during snake bite."
    	},
    	
    	{
    		"1. Eating a fresh Gooseberry (Amla) daily is helpful in curing stammering. A Spoon of dry Gooseberry powder with a spoon of pure Ghee taken in the morning is also helpful in curing Stammering.",
    		"2. Dip 12 Almonds 9Badam) overnight and peel them in the morning. Grind them and eat with 30 grams of pure butter. Continue this for few months to overcome stammering.",
    		"3. Grind 10 Almonds and 10 whole Black peppers (kali mirch) with a piece of Sugar candy (Mishri) and take it for some days to overcome Stammering.",
    		"4. Eating dry Dates (Chuara) before going to bed but avoid drinking water for a least 2 hours, also helps to clear the voice and cures Stammering."
    	},
    	
    	{
    		"1. Make a fine form of paste of Three - Leaved Caper leaves and apply on stretch marks (after pregnancy women get marks on their stomach). This will helps to remove stretch marks forever.",
    		"2. People with stretch marks may feel very self-conscious regarding their ‘scars’. A variety of moisturizers, creams and oils containing natural ingredients are available to reduce and prevent the appearance of stretch marks. More and more women are choosing to use natural and holistic treatments during their pregnancy because they are gentle on the body and support healthy skin from the inside out.",
    		"3. Biochemic salts such as Calcium Fluoride, Natrium Muriaticum and Calcium Phosphate restore tone and elasticity to muscles, connective tissue and skin and help to maintain the body’s water balance. Keeping your belly well moisturized throughout your pregnancy will help to reduce dryness and itching that often accompanies stretch marks. There are also many natural ingredients to promote healing of the skin, if such as Rosehip oil that has the ability to rebuild damaged skin tissue and can reduce the appearance of current stretch marks."
    	},
    	
    	{
    		"1. Make tea with Neem leaves or fruits and drink regularly. It has given good results for the disease."
    	},
    	
    	{
    		"1. Brushing with Sea salt as a tooth powder is a very beneficial remedy for home teeth whitening.",
    		"2. Brush your teeth at least 2 times per day – morning and night. But it will be really useful if you practice brushing and cleaning teeth after eating so you can maintain your teeth whiteness every time. Don’t forget to use floss as the bacteria could affect the whiteness.",
    		"3. Prepare a paste by mixing the salt, honey, milk, lemon and turmeric powder and brush twice with this paste will helps for teeth whitening.",
    		"4. Twigs of neem tree are indian traditional brushing for tooth whitening. These twigs of neem are also kills complete germs and helps to strengthen your teeth. This is very beneficial home remedy for teeth whitening and stronger teeth.",
    		"5. Brush your teeth with the mixture of 60 grams of charcoal of babul tree wood, 24 grams of roasted alum and 12 grams of rock salt."
    	},
    	
    	{
    		"1. Always wash your eyes with cold water to get rid off tiredness.",
    		"2. Place a cucumber slices on closed eyes.",
    		"3. Close your eyes and stay in a closed room without any noise.",
    		"4. Give relaxation to your eyes, when you feel your eyes are tired.",
    		"5. Have a bath with cold water, which will give some relaxation to your head. Which means you will sense of losing some weight from your head and on eyes. This is one of the traditional technique, which is used by elders in olden days."
    	},
    	
    	{
    		"1. Chewing Dry coconut with Sugar candy (Mishri) gives relief from cuts on the tongue.",
    		"2. Applying honey on the cut also helps in curing cuts on the tongue.",
    		"3. Sucking a Clove (Laung) also helps in curing cuts on the tongue.",
    		"4. Apply the powder of neem leaves on the cut area. It enables in the easy recovery of the affected area.",
    		"5. By applying small amount of pure coconut oil on tongue cuts, which will relieve you from pain and cures the tongue cut problem in just two to three days. Make sure to apply the coconut oil in regular intervals.",
    		"6. Eating of dry coconut will give excellent relief from tongue cut."
    	},
    	
    	{
    		"1. Gargle the decoction of Babul tree bark mixed with rock salt."
    	},
    	
    	{
    		"1. Cotton dipped in Raw papaya ( Papita ) juice applied on the affected tooth, reduces tooth ache immediately.",
    		"2. Keeping a piece of Onion of the affected tooth reduces tooth ache.",
    		"3. Washing mouth with Hot water mixed with Salt gives relief from tooth ache.",
    		"4. Boil few tender Mango leaves in water and washing mouth with this water, reduces tooth ache.",
    		"5. Put a piece of crushed Clove or a cotton piece dipped in Clove oil on the affected tooth, gives relief from tooth ache.",
    		"6. keeping a piece of Tobacco on the affected tooth reduces pain in case of severe tooth ache.",
    		"7. Boil Neem leaves in water and washing mouth with this water, reduces tooth ache.",
    		"8. put a piece of Camphor (karpoor ) or camphor piece dipped in Gooseberry ( Amla ) juice on the affected tooth, reduces tooth ache.",
    		"9. Boil some fresh Guava ( Amrud ) leaves in water and washing mouth with this water, or simply chewing fresh Guava ;eaves, helps to reduce tooth ache.",
    		"10.Roast a piece of Turmeric kept on the affected tooth gives relief from tooth ache.",
    		"11.A roasted Garlic with salt can be put on the affected tooth helps in reducing tooth ache.",
    		"12.Putting a piece of Asafoetida (Hing) on the affected tooth, helps to reduce tooth ache.",
    		"13.Basil (Tulsi) leaves grinded with Black pepper (Kali mirch ) applied on the affected tooth gives relief from tooth ache.",
    		"14.Boil few Carom (Ajwain) seeds in water and washing mouth with this warm water and keeping the warm water on the affected teeth for some time helps in reducing tooth ache.",
    		"15.putting ground Mint leaves (pudina) with salt on the affected tooth, reduces tooth ache.",
    		"16.Boil Cardamoms ( Elaichi ) in water and washing mouth with this water helps in reducing tooth ache.",
    		"17.If pure home made butter is available, make a small ball and wrap it with cotton. Applying this ball on the affected tooth for sometime cures tooth ache.",
    		"18.Chew a clove or dip a piece of cotton wool in clove oil and place on the aching tooth for best results.",
    		"19.Ice is excellent in numbing nerve endings. Try to compress the affected area with ice. But if it aggravates the pain, discontinue it."
    	},
    	
    	{
    		"1. Drinking Sweet lime (Mosambi) juice is beneficial during Typhoid.",
    		"2. Eating Banana pulp mixed with Buttermilk reduces fever during typhoid. This technique known by only elder people, as this is one of the oldest method in the treatment of typhoid fever.",
    		"3. Eating Californian raisin (Munakka) Helps to kill typhoid causing bacteria's, this is one of the traditional home remedy to cure typhoid fever naturally.",
    		"4. Boil five cloves (Laung) in water for 10 minutes filter. Drinking this decoction after cooling twice a day helps to get relief from Typhoid.",
    		"5. Eating Orange and drinking of milk. thrice is also beneficial during Typhoid.",
    		"6. Drinking hot water mixed with a spoon of Honey is helpful during typhoid.",
    		"7. Drinking Apple juice is also advisable during Typhoid.",
    	},
    	
    	{
    		"1. Fry the cumin seeds and add same quantity of rock salt (Saindhava Lavana) to it. Now make fine form of powder and store it for further usage. Eating of this powder can helps to stop vomiting immediately.",
    		"2. Drinking lemon water or smelling a lemon while traveling is the best solution to stop vomiting due to motion sickness.",
    		"3. Eating Orange with Salt preferably Black salt helps to vomiting caused by motion sickness.",
    		"4. Ripe Banana is helpful during blood stains in the vomit.",
    		"5. A pinch of powdered Clove (Laung) with Honey taken helps to stop vomiting during pregnancy.",
    		"6. Eating Gooseberry (Amla) Morabba helps to stop vomiting during pregnancy.",
    		"7. Roasted Bengal gram (Chana) powdered and taken with water helps to reduce vomiting during pregnancy.",
    		"8. Drinking water melon (Tarbooj) juice mixed with Sugar candy (Mishri) powder, helps to stop vomiting caused by pitt.",
    		"9. Drinking a spoon of Tamarind juice (Imli) helps to stop vomiting caused by Pitt.",
    		"10.Drinking Sugar cane juice (Ganna) Juice with Honey, Helps to stop vomiting caused by Pitt.",
    		"11.Boil ground Coriander (Dhania) Seeds or leaves grinded in water and filter. Sipping the decoction slowly,helps to stop vomiting.",
    		"12.Drinking a spoon of Basil (Tulsi) Juice with Honey helps to vomiting.",
    		"13.Boil Neem leaves in water and filter. Drinking this decoction helps to stop vomiting.",
    		"14.Eating Harad (Terminalia chebula, haritaki) powder mixed with Honey, helps to stop vomiting.",
    		"15.Drinking Mint (Pudia) juice Mixed with Lemon Juice, helps to stop vomiting.",
    		"16.Putting some wet cloth on the stomach over the navel area cools the stomach and helps to stop vomiting due to Pitt.",
    		"17.Eating a raw Onion with Honey or drinking a spoon of Onion juice and Ginger Juice, helps to stop vomiting.",
    		"18.Sprinkle Black pepper (Kali mirch) powder and Rock salt (Saindha namak) on a piece of Ginger. Slowly sucking the ginger helps to stop vomiting.",
    		"19.Taking cumin seeds (Jeera) powder, Cardamoom powder (Elaichi) mixed in a spoon of Honey, or drinking milk boiled with Cumin seds powder and Cardamom powder, helps to stop vomiting.",
    		"20.Taking powdered Cinnamon (Dalchini) Mixed with Honey, or drinking milk boiled with Cinnamon, helps to stop vomiting.",
    		"21.Sucking a piece of Ice (Baraf) helps to stop vomiting.",
    		"22.In half glass of water put half spoon of Lemons juice, pinch of Cumin (Jeera) powder and a pinch of Cinnamon (Dalchini) powder. Drinking this thrice a day helps to stop vomiting.",
    		"23.Grind Black pepper (kali mirch) with Onion and tie this in a clean thin cloth and hang it. The juice which drops from this cloth can be taken to stop vomiting.",
    		"24.smelling roasted Clove (Laung) helps to stop vomiting sensation.",
    		"25.Boil two Cloves with a pinch of Cinnamon (Dalchini) in water and filter, Drinking this decoction helps to stop vomiting.",
    		"26.Water mixed with powder of fried cloves (2 pinch taken).",
    		"27.Take the tender ends of the aerial roots of Banyan tree. It helps in obstinacy of vomiting."
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
    		"1. Mix two teaspoons of organic apple cider vinegar to 16 oz. of water. Take a few sips of this mixture throughout the day but be aware do not drink it at once.",
    		"2. Drinking Fruit Smoothies will enhance your chances to lose weight go for them.",
    		"3. Vegetables such as bitter gourd (Karela), and bitter variety of drumstick proved useful in loosing weight.",
    		"4. Honey is an excellent home remedy for losing weight. It mobilizes the extra fat in the body allowing it to be utilized as energy for normal functions.",
    		"5. Mix one teaspoon of fresh honey with the juice of half a lime in a glass of lukewarm water, it is a beneficiary home remedy which treats the obesity and promotes weight loss.",
    		"6. Spices such as dry ginger, cinnamon, black pepper etc. are nice stuff for loosing weight and can be used in a number of ways.",
    		"7. Milk products like cheese, butter etc. and non-vegetarian foods should be avoided as they are rich in fat.",
    		"8. If you need a quick result for losing weight, eat papaya or vegetable soup as your dinner for 2-3 months, it helps in controlling obesity.",
    		"9. The effective remedy to lose or control weight is drinking Green tea. Drink green tea or ginger tea as ginger, it helps in burning excessive fat.",
    		"10.A good household remedy to cure obesity is to soak 1-2 tablespoon of horse gram in a glass of water and allow it to rest overnight and take the soaked solution every morning in an empty stomach.",
    		"11.Mix black pepper powder in vegetable soup and vegetables. It not only enhances the flavor of your food items but also helps in controlling obesity and burning excessive fat.",
    		"12.One must not eat his/her break fast heavily, instead eat one or two tomatoes, on an empty stomach, every morning.",
    		"13.Soak handful of jujube or Indian plum leaves in water overnight. Drain the water and eat these on an empty stomach. Do it to believe it.",
    		"14.Carrot juice with water is another home remedy used to lose weight.",
    		"15.Eat plenty of french beans, jack fruits, grapes, figs, peaches, phalsa and guava.",
    		"16.The best remedy to lose weight is to consume 10 grams of honey and a glass of warm water each morning on an empty stomach.",
    		"17.Make ginger paste and add a small amount to honey to it. Consume this along with ½ tsp natural gargle.",
    		"18.Chewing thin slice of ginger root before meals is beneficial in weight loss",
    		"19.Prepare chutney of mint leaves. This must be taken with every single meal. It helps in the proper breaking down of the fats.",
    		"20.Have a totally salt-free diet once a week. This helps reduce weight. Also skip a meal once in a month.",
    		"21.Drink a lot of fluids in the day it helps to eliminate the undigested foods effectively.",
    		"22.Do not overindulge in eating any one type of food. Keep your diet balanced.",
    		"23.Drink the syrup made by 1 cup of water; add 3 tsp of lime juice, half tsp pepper powder and some honey, for at least three months. You will see the best possible results.",
    		"24.Consuming a healthy amount of fish oil each day actually helps one lose weight.",
    		"25.Eat one pound of raw pumpkin or 4 to 5 pounds of baked or boiled pumpkin a day for three four months."
    	},
    	
    	{
    		"1. Daily eating of red onion can clear the worms in your stomach. This is one of the traditional home remedy for worms.",
    		"2. Eating of 3 grams bitter gourd seeds powder with 5 grams of honey three times a day can helps to get rid of worms.",
    		"3. Drinking 3 spoons of Balanites Aegyptiaca raw fruit juice with empty stomach in early morning helps to remove worms completely in the body.",
    		"4. Eating a pinch of roasted asafoetida(hing) mixed with a spoon of lemon juice in the morning for 6 days,helps to get rid of Worms.",
    		"5. 10 seeds of ripe papaya (papita) grinded with 1/4th cup of water taken for 7days, helps to get rid of Worms.",
    		"6. Drinking salted buttermilk in the morning is helpful in healing Worms.",
    		"7. Drinking bitter gourd(karela) juice or Bitter ground juice with erual amount of Coconut milk for few days,helps to get rid of Worms.",
    		"8. Drinking a spoon of Basil (Tulsi) juice for few days,helps in killing Worms.",
    		"9. Drinking water mixed with few drops of neem oil few days,helps to kill Worms.",
    		"10.Boil a spoon of Coriander (Dhania) powder and Black pepper(Kali mirch) powder in water and filter.Drinking this decoction for few days,helps to get rid of Worms.",
    		"11.Drinking one spoon of Honey mixed with two spoons of curd for few days, helps to kill worms.",
    		"12.Drinking pomegranate juice everyday also helps to kill worms.",
    		"13.drinking Coconut water and eating raw coconut. Both are useful for get rid of Worms.",
    		"14.Drinking half cup of mint juice (pudina) for 7days,helps to kill Worms.",
    		"15.Sprinkle a pinch of black pepper and salt on red Tomatoes.Eating this Tomato in the morning, helps to kill Worms.",
    		"16.A spoon of carom (Ajwain) powder mixed with jaggery(Gur),taken when stomach is empty for 3days,helps in killing Worms.",
    		"17.Drinking a spoon of Onion juice in 2 hours for few days helps to kill Worms.",
    		"18.Powder few Lemon seeds and mix it with 1/4th cup of water. Drinking this for 7 days,Kill Worms.",
    		"19.Eating Apple in the night before going to bed and avoid drinking water the whole night. Repeating this for few days,helps to kill Worms.",
    		"20.Taking 2 grams of Mango seeds powder with water for some days, helps to get to rid of Worms.",
    		"21.Drinking 2spoon of Indian Gooseberry (Amla) juice for 5 days helps to get rid of Worms.",
    		"22.Drinking Carrot juice empty stomach for few days,helps to get rid Worms.",
    		"23.Drinking hot water,half an hour after few days,helps to get rid of Worm.",
    		"24.Eating half spoon of salt before meals for 10days, doesn't allow Worms to multiply,and also kill Worms.",
    		"25.Eating Lentil (masoor) dal regularly for few days doesn't allow Worms to multiply,and also kill Worms.",
    		"26.Tasking 4 grams of Carom (Ajwain) power with a glass of buttermilk for 7dasy or taking 7drops of Carom oil,helps in killing Worms.",
    		"27.Eating roasted Corn (Bhutta) once in a while doesn't allow Worms to develop.",
    		"28.Eating few Ash gourd (petha) seed with sugar for few days,helps to kill Worms.",
    		"29.Eating a pinch of Asafoetida (Hing) mixed with a spoon of fresh Neem juice before going to bed for 3 days,helps in killing Worms.",
    		"30.Half spoon of Garlic Juice mixed with Sugar for few days, helps to kill Worms.",
    		"31.Eating raw Papita (papaya) with sugar for few days,destroys Worms.",
    		"32.One gram of Black pepper (Kali mirch) powder with Buttermilk taken for 7dyas,Helps to get Rid of Worms.",
    		"33.Eating a Wall nut (Akhrot) with milk for few days,helps to kill Worms especially in children.",
    		"34.Eating Jaggery(gur) before taking any allopathic medicine for killing Worms is very beneficial, as Worms sticking in the intestine wall will come out to eat jaggery and get killed.",
    		"35.Eating Harad ( Haritaki) is also a very good remedy for killing Worms.",
    		"36.Dilute tamarind decoction helps in destroying the stomach worms in children."
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
    	},
    	  	
    	{
    		"1. Drinking at least 8 glasses of water per day and sleep adepuately to make skin tight and wrinkles free..",
    		"2. Vitamin A rich foods such as carrot,Tomato Cabbage (patta gobi) Coriaber (Dhania) Amaranth (Cholayi) Mango Papaya,Orange,Milk Butter can be taken which helps to overcome wrinkles problem.",
    		"3. Regularly applying Cabbage paste with a spoon of Honey on the face and washing face after an hour tightens skin and wrinkle free.",
    		"4. Doing exercises like taking water or air in the mouth and transferring it from one side to another several times, tightens face skin and wribkels free.",
    		"5. Open your mouth as wide as possible and the close as tight as possible several times, this excersise helps to get wrinkle free face.",
    		"6. Regulary massaginig face with Castor oil (Erand) or coconut oil makes face wrinkle free.",
    		"7. Beat egg whites of two eggs and aplly on the face and wash the face with cold water after half an hour which helps in reducing wrinkle on then face."
    	},
    	
    	{
    		"1. One of the most effective ways to cure yeast infection would be to wash the area with diluted apple cider vinegar.",
    		"2. Butter milk will aid you in killing Yeast infection. Have a glass of buttermilk every day, especially at night.",
    		"3. Soak a cotton tampon in curd and insert in the vagina for an hour. Repeat the process 2-3 times a day. It is very beneficiary in treating Infections.",
    		"4. Apply baby oil with aloe and vitamin E. It is likely to bring relief from irritation and itching.",
    		"5. Dip a cotton tampon in tea tree oil and insert it at night, remove in the morning. Repeat the process for 3 to 4 days. It will treat your yeast infections.",
    		"6. It may burn a bit it the effective way to treat Yeast infections is to make a paste of garlic pods and apply to skin around the vagina.",
    		"7. Fill a bathtub with warm water mixed with 1 cup of vinegar. Soak in this bath solution for about 20 minutes. Dry the vaginal area thoroughly using super absorbent paper.",
    		"8. Take half a cup of honey into the bathroom. Pour a liberal amount of honey on all affected portions. Have a bath with warm water and dry the vaginal area thoroughly using using super absorbent paper.",
    		"9. The effective way of treating yeast infection is to insert capsules of boric acid in the affected area, overnight, for several days."
    	}
    	
    };
    void makeChanges(String seq){
    	int ctr=0;
    	int i;
		  for(i=0;!(arrGroupelement[i].equals("end"));i++){
			  if (arrGroupelement[i].toLowerCase().contains(seq.toLowerCase())){
				  arrGroupelements.add(arrGroupelement[i]);
				  arrChildelements[ctr]=arrChildelement[i];
				  ctr++;
			  }
		  }
    }
    ExpandableListView expList;
  
    
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.medical_remedy_main);
        Intent i = getIntent();
        String word = i.getStringExtra("word");
        arrGroupelements.removeAll(arrGroupelements);
        makeChanges(word);
        if (arrGroupelements.size()==0)
        {
        	Intent in = new Intent("com.MedicalRemedy.android.NOSEARCH");
			startActivity(in);
			finish();
        }
        Log.d("&&&&","activity called first");
        expList = getExpandableListView();
        expList.setAdapter(new AllDataAdapter(this));
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
        		in.putExtra("title", arrGroupelements.get(groupPosition));
        		in.putExtra("text", arrChildelements[groupPosition][childPosition]);
        		startActivity(in);
        		return false;
        	}
        });
    }   
}