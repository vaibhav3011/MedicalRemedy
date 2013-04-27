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

public class FemaleMedicalRemedyExpListActivityHead extends ExpandableListActivity
{
 /**
  * strings for group elements
  */
    static final String arrGroupelements[] = 
    {
     	"Acne/Pimples",
    	"Allergies",
    	"Anxiety",
    	"Bad Breath",
    	"Baldness",
    	"Bruises",
    	"Burns",
    	"Chicken Pox",
    	"Cold / Running Nose",
    	"Conjunctivitis",
    	"Cough",
    	"Dandruff",
    	"Depression",
    	"Dizziness",
    	"Dry and Chapped Lips",
    	"Dry Cough",
    	"Ears",
    	"Eczema",
    	"Excessive Sweating",
    	"Eyes",
    	"Fever",
    	"Flu",
    	"Grey Hair",
    	"Hair Fall",
    	"Hair Loss",
    	"Head Ache",
    	"Head Lice",
    	"Healing",
    	"Healthy Hair",
     	"Hiccough",
    	"Increase Memory Power",
    	"Increase Resistance Power",
    	"Insomnia",
    	"Migraine",
    	"Mouth Ulcer",
    	"Mumps",
    	"Natural Hair Loss",
    	"Nose Bleeding",
    	"Pains Remedies",
       	"Poisonous Bites",
       	"Pyorrhea",
       	"Shingles",
    	"Sinus Infection",
    	"Skin",
    	"Stammering",
    	"Teeth Whitening",
    	"Tired Eyes",
    	"Tongue Cuts",
    	"Tonsillitis",
    	"Tooth Ache",
    	"Warts",
    	"Wounds",
    	"Wrinkles"
    };
 
    /**
     * strings for child elements
     */
    static final String arrChildelements[][] = 
    {
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
    		"1. Drink milk mixed with three grams of Ashwagandha two times a day can helps to Cure Anxiety.",
    		"2. 1 tsp dried amla powder could be soaked in one cup of water overnight to which 1/8 tsp of black pepper powder and 2 tsp of lime juice added. The mixture is diluted as required for consumption.",
    		"3. Make a mixture of Liquorice (Atimadhuram), Verbanaceae (Saraswati Leaf ) and Amla (Usirika Varugu) same quantities. By taking 3 grams of this mixture with water or honey three times a day can helps in curing anxiety."
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
    		"1. Eating a fresh Gooseberry (Amla) daily is helpful in curing stammering. A Spoon of dry Gooseberry powder with a spoon of pure Ghee taken in the morning is also helpful in curing Stammering.",
    		"2. Dip 12 Almonds 9Badam) overnight and peel them in the morning. Grind them and eat with 30 grams of pure butter. Continue this for few months to overcome stammering.",
    		"3. Grind 10 Almonds and 10 whole Black peppers (kali mirch) with a piece of Sugar candy (Mishri) and take it for some days to overcome Stammering.",
    		"4. Eating dry Dates (Chuara) before going to bed but avoid drinking water for a least 2 hours, also helps to clear the voice and cures Stammering."
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
    	},
    	  	
    	{
    		"1. Drinking at least 8 glasses of water per day and sleep adepuately to make skin tight and wrinkles free..",
    		"2. Vitamin A rich foods such as carrot,Tomato Cabbage (patta gobi) Coriaber (Dhania) Amaranth (Cholayi) Mango Papaya,Orange,Milk Butter can be taken which helps to overcome wrinkles problem.",
    		"3. Regularly applying Cabbage paste with a spoon of Honey on the face and washing face after an hour tightens skin and wrinkle free.",
    		"4. Doing exercises like taking water or air in the mouth and transferring it from one side to another several times, tightens face skin and wribkels free.",
    		"5. Open your mouth as wide as possible and the close as tight as possible several times, this excersise helps to get wrinkle free face.",
    		"6. Regulary massaginig face with Castor oil (Erand) or coconut oil makes face wrinkle free.",
    		"7. Beat egg whites of two eggs and aplly on the face and wash the face with cold water after half an hour which helps in reducing wrinkle on then face."
    	}
    };

    ExpandableListView expList;
  
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical_remedy_main);
         
        expList = getExpandableListView();
        expList.setAdapter(new FemaleMedicalRemedyExpAdapterHead(this));
   
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