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

public class MaleMedicalRemedyExpListActivityStomach extends ExpandableListActivity
{
 /**
  * strings for group elements
  */
    static final String arrGroupelements[] = 
    {
    	"Acid Reflux",
    	"Acidity",
    	"Allergies",
    	"Anemia",
    	"Arthritis",
    	"Asthama",
    	"Back Pain",
    	"Bad Body Odour",
    	"Bed Wetting / Enuresis",
    	"Body Care",
    	"Bronchitis",
    	"Bruises",
    	"Burning Urine / Dysuria",
    	"Burns",
    	"Cancer",
    	"Cholera",
    	"Cholesterol",
    	"Constipation",
    	"Diabetes",
    	"Diarrhea",
    	"Eczema",
    	"Erectile Dysfunction",
    	"Excessive Sweating",
    	"Gas / Flatulence",
    	"Heart Attack",
    	"Heartburn",
    	"Hemorrhoid",
    	"Herpes",
    	"High Blood Pressure",
    	"Improve Appetite",
    	"Increase Weight",
    	"Indigestion",
    	"Irritable Bowel Syndrome",
    	"Itching",
    	"Jaundice",
    	"Leucorrhoea",
    	"Loose Motion",
    	"Low Blood Pressure",
    	"Malaria",
    	"Menstrual Stomach Ache",
     	"Obesity / Overweight",
    	"Pains Remedies",
    	"Piles",
    	"Pneumonia",
    	"Poisonous Bites",
    	"Prickly Heat",
    	"Shingles",
    	"Skin",
    	"Stretch Marks",
    	"Syphilis",
    	"Typhoid",
    	"Vomiting",
    	"Warts",
    	"Weight loss",
    	"Worms",
    	"Wounds",
    	"Yeast Infections"
    };
 
    /**
     * strings for child elements
     */
    static final String arrChildelements[][] = 
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
    		"1. Use natural home made herbal bath powder for bath. Which will helps to get rid of skin problems and helps to maintain good skin.",
    		"2. Daily applying the paste made from outer bark of apple tree on skin can helps to clear all types of skin problems in very short span of time.",
    		"3. Use clean and dry towel to every bath, it will prevents skin related problems or skin diseases.",
    		"4. For complete skin protection make a strong tea with neem leaves and add to the bath along with a little rose water."
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

    ExpandableListView expList;
  
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical_remedy_main);
         
        expList = getExpandableListView();
        expList.setAdapter(new MaleMedicalRemedyExpAdapterStomach(this));
   
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