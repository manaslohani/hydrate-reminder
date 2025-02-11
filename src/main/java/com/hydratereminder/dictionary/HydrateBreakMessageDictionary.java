package com.hydratereminder.dictionary;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.hydratereminder.HydrateReminderPersonalityType;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HydrateBreakMessageDictionary {

    /**
     * Hydrate Reminder interval break text to display in simple form
     */
    private static final List<String> HYDRATE_BREAK_SIMPLE_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("It's time for a quick hydration break");
                    }}
            );
    /**
     * Hydrate Reminder interval break text to display in funny form
     */
    private static final List<String> HYDRATE_BREAK_FUNNY_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("It's time for a quick hydration break");
                        add("Dehydration causes fatigue so take a hydration break");
                        add("It's time to drink some good ol' water");
                        add("Stay healthy by taking a hydration break");
                        add("Time to glug, glug, glug some water");
                        add("It is now time to take a hydration break");
                        add("Time to hydrate");
                        add("Power up with a hydration break now");
                        add("Got water? It's time to hydrate");
                        add("Cheers to this hydration break");
                        add("Hydration time is now");
                        add("Fuel up with a hydration break");
                        add("3... 2... 1... It's hydration time");
                        add("Feeling parched yet? It's hydration time");
                        add("Now would be a fantastic time to hydrate");
                        add("Water... you need... water");
                        add("Thirsty? Time to grab a drink");
                        add("Water: a liquid that is necessary for life. Why don't you drink some");
                        add("Hello, this is your reminder to take a hydration break");
                        add("Remember to stay hydrated");
                        add("What'cha drinking there? It's time to take another sip");
                        add("Ding ding ding! Hydration time");
                        add("Everyone needs water, you should drink some now");
                        add("Time for another glass of water");
                        add("You've been grinding hard, time to reward your self with a hydration break");
                        add("Water makes the world go 'round, you should drink some now");
                        add("Hydration can improve your ability to focus, time for a hydration break");
                        add("Time to take a break and hydrate");
                        add("Dehydration can cause you to feel dizzy and lightheaded, take a hydration break");
                        add("Dehydration can cause dry mouth, lips, and eyes. Take a hydration break");
                    }}
            );
    
    /**
     * Hydrate Reminder interval break text to display in caring form
     */
    private static final List<String> HYDRATE_BREAK_CARING_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Drink water before it's too late");
                        add("Drink water and you shall be saved");
                        add("No matter how rich you are, remember to drink water");
                        add("Pure water = better life. Drink it");
                        add("A good day starts with water");
                        add("Don't be thirsty. Drink water");
                        add("Water is sacred! Drink it");
                        add("Water is a human right! Use it right now");
                        add("No water = no life! Bring yourself back to life");
                        add("Why are you dehydrated? Drink water");
                        add("Save yourself from being thirsty! Drink water");
                        add("Take care of your mental health! Drink some water");
                        add("Your future seems brighter when you drink water");
                        add("Clear your thoughts! Drink some water");
                        add("Take a sip of water because I care for you and want to see you healthy");
                    }}
            );

    /**
     * Hydrate Reminder interval break text to display in nerdy form
     */
    private static final List<String> HYDRATE_BREAK_NERDY_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Your body is 60% water, don't forget to maintain that percentage, it's time to hydrate");
                        add("H₂O is the most neglected nutrient in your diet, but one of the most vital, it's time to drink some water");
                        add("Adequate hydration is essential for the proper functioning of the brain, take a small water break.");
                        add("Water has a high specific heat capacity, have some water to regulate that body temperature of yours");
                        add("When dehydrated, the skin can become more vulnerable to skin disorders and wrinkling, it's time to rehydrate");
                        add("Can the water from your faucet contain same molecules that once a dinosaurs drank?Could be! Anyways it is time to rehydrate");
                        add("A person can live live only about a week without water, help yourself with a glass of water.");
                        add("Your body constantly loses water through sweating and exhalation, drink a glass of water, and stay hydrated");
                        add("Water consumption helps cushion your joints and tissues, protecting your body, drink water to stay protected");
                        add("Globally,  about 748 million people have no access to safe and clean drinking water, drink water while you have it");
                        add("Mild dehydration of about 1.4% can also impair your mood and concentration, stay hydrated to stay in the mood");
                        add("Inadequate fluid consumption is a common culprit in constipation,therefore I recommend you grab a glass of water");
                        add("Did you drink your 15.5 cups (3.7 liters) of fluids today, if not drink 1 cup of water right now");
                        add("Did you know H₂O has a density of 997 kg/m³? Anyways, it's time to hydrate");
                    }}
            );
  


    /**
     * Hydrate Reminder interval break text to display in romantic form
     */
    private static final List<String> HYDRATE_BREAK_ROMANTIC_TEXT_LIST =
            Collections.unmodifiableList(
                new ArrayList<String>() {{
                    add("Roses are red, violets are blue, this hydrate reminder is just for you");
                    add("You can keep my heart but bring me back to life by drinking some water!");
                    add("Stop making me think about you! I'm busy drinking water");
                    add("You make my heart melt! Please drink some water");
                    add("Just a note to remind you I'm thinking about you and drinking some water");
                    add("As the flower needs the sunshine, I need you in my life. Please drink some water");
                    add("Your heart is so full of love, and I'm lucky enough to find a place there. Please drink some water");
                    add("In all the world, there is no heart for me like yours. Drink some water to keep me in your heart.");
                    add("Every time I think about you, my heart dances. Drink some water to keep it dancing.");
                    add("You are artwork I could admire forever. Please drink some water");
                    add("My soul and your soul are forever tangled. Please drink some water");
                    add("Being with you makes my heart sing. Take a sip of water and keep it singing.");
                }}
            );


    /**
     * Hydrate Reminder interval break text to display in polite form
     */
    private static final List<String> HYDRATE_BREAK_POLITE_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Drinking water will boost your concentration. Kindly have a sip");
                        add("Your beautiful skin will shine brighter when hydrated. Please go ahead");
                        add("If you don't mind, please take a short break to hydrate");
                        add("Hydration time! Please drink some water");
                        add("Keep that smile on! Kindly have some water");
                        add("Water is the best of all things. Please keep yourself hydrated");
                        add("I'd prefer you to take a quick hydration break, please");
                        add("Let your body sing you a lullaby. Please hydrate");
                        add("It'll be great if you take a small hydration break");
                        add("You seem dehydrated! Please drink some water");
                        add("Please don't hesitate to take a small water break");
                        add("Please take care of yourself! Drink some water");
                        add("Your future seems brighter when you drink water. Please have a sip");
                        add("To be honest, you really need a hydration break. Kindly grab a drink");                  
                    }}
            );

    /**
     * Hydrate Reminder interval break text to display in pirate form
     */
    private static final List<String> HYDRATE_BREAK_PIRATE_TEXT_LIST =
    Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("Ahoy Matey! Sit down next to me and grab a drink!");
                add("Aaarghh! You look as dry as a skull! Get some water now!");
                add("Avast Ye! Haven't seen you drinking all day! Time to drink!");
                add("Shiver me timbers, you better drink some water before you collapse!");
                add("Yo-ho-ho, let's have a drink together!");
                add("You better have a jug of water, or I will make you walk the plank!");
                add("Arrr, the ocean reminds me, that you should take a water break!");
                add("Avast! There's a storm coming up, better drink something to be ready!");
                add("Ahoy, welcome on the ship! Let's get inside and have a drink together!");
                add("Blimey, when was the last time you drank something? Better do it now!");
                add("Great job catching all these fish, now grab a drink!");
                add("Yo-ho-ho, you desperately need a water break!");
                               
            }}
    );
    
    /**
     * Hydrate Reminder interval break text to display in wizard form
     */
    private static final List<String> HYDRATE_BREAK_WIZARD_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("You'll only want for it if you haven't got it - refill your water reserves");
                        add("YOU SHALL NOT PASS - until you take a sip of water");
                        add("Your remembrall is turning red - don't forget to hydrate");
                        add("Rest here weary traveler, for great adventures lie ahead - take a sip of water");
                        add("The oracle forecasts peculiar times - partake in the steady comfort of water");
                        add("On a quest young warrior? Take a sip of water before you set off");
                        add("Take a swig of water for your health and one more for luck");
                        add("There is a time for all things - now's the one for a water break");
                        add("How fare ye, brave traveller? Art thou well fed and watered?");
                        add("One can go for days without magic, but not one without water");
                        add("Whether the way winds through marsh or mountain, the wise always hydrate");
                        add("I've seen many a war waged and peace forged by the water you drink - savour it");
                    }}
            );
    
    /**
     * Hydrate Reminder interval break text to display in motivational form
     */
    private static final List<String> HYDRATE_BREAK_MOTIVATIONAL_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Water is the Driving Force of All Nature. Grab some");
                        add("Water is the Best Natural Remedy. Drink Your Way to Better Health");
                        add("Drink Pure Water. Stay Healthy. Stay lively");
                        add("Hydration time! Drink some water and keep going");
                        add("There is No Small Pleasure in Pure Water. Enjoy it");
                        add("Water is the best of all things. Stay hydrated and rule the day");
                        add("When the Well is Dry, We’ll Know the Worth of Water. Drink well, live well");
                        add("Do your body a favor, stay hydrated, stay healthy");
                        add("Pure Water is the World’s First and Foremost Medicine. Use it");
                        add("Water is Your Best Friend for Life. Catch up with a break");
                        add("Keep Calm & Drink Water");
                        add("Water is Life. Don’t Waste It. Drink it");
                        add("It's time to rejuvinate your body with water for a better and healthier you");
                        add("Thousands Have Lived Without Love, Not One Without Water. Take a sip");                  
                    }}
            );

    /**
     * Hydrate Reminder interval break text to display in Aggressive form
     */
    private static final List<String> HYDRATE_BREAK_AGGRESSIVE_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Go grab some Water NOW!");
                        add("Water Now or Never, You need It!");
                        add("You should be Hydrated, No questions asked!");
                        add("I need to see you hydrating right here right now with no excuses");
                        add("Hydration Time! You Gotta Enjoy it");
                        add("Thirsty? We Know, All you want is Water");
                        add("Your Body is made up of 70% water, Don't Drain that number to 0, Go Drink Water");
                        add("Do Yourself a Favor, Drink Some Water");
                        add("Water Will never Leave you, So enjoy every sip of it");
                        add("You gotta drink some Water, Yeah!");
                        add("We all love Water, Dont We?");
                        add("You just can't waste any Water, It Deserves your Body");
                        add("Stop For a Moment, Enjoy every Sip of Water");
                        add("Water We all Love it, Just Can't Deny");
                    }}
            );

    /**
     * Hydrate Reminder interval break text to display in Santa form
     */
    private static final List<String> HYDRATE_BREAK_SANTA_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Smile and drink some water! Santa's coming to town");
                        add("All I want for Christmas is you....drinking enough water");
                        add("Ho ho ho! Time to drink");
                        add("My elves are really busy but always remember to drink water. What about you?");
                        add("Let's sit around the Christmas tree and drink some water together");
                        add("Last year I gave you a cup...so fill it with water and drink some right now...");
                        add("Have you been naughty and kept forgetting about hydration breaks?");
                        add("I brought you some presents and bottles of water, let's drink");
                        add("Don't be shy kiddo, come and have a drink with Santa");
                        add("I still have a lot of chimneys to visit, but first, let's have a little hydration break together");
                        add("You know, Mrs. Claus gets really mad at me when I forget about water breaks");
                        add("Ho, ho, ho! Hydration break");
                        add("Look at my Rudolph here, he's always hydrated! Are you?");
                        add("Here is your Christmas gift, but remember - the best gift for future you is drinking enough water");
                        add("Please drink a glass of water. Merry Christmas");
                    }}
            );


    private static String getRandomBreakMessage(List<String> hydrateBreakTextList)
    {
        final SecureRandom randomGenerator = new SecureRandom();
        final int randomNumber = randomGenerator.nextInt(hydrateBreakTextList.size());
        return hydrateBreakTextList.get(randomNumber);
    }

    public static String getRandomHydrateBreakMessageForPersonality(HydrateReminderPersonalityType personalityType)
    {
        String breakMessage;
        switch (personalityType)
        {
            case SIMPLE:
                breakMessage = HYDRATE_BREAK_SIMPLE_TEXT_LIST.get(0);
                break;
            case FUN:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_FUNNY_TEXT_LIST);
                break;
            case CARING:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_CARING_TEXT_LIST);
                break;
            case ROMANTIC:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_ROMANTIC_TEXT_LIST);
                break;
            case POLITE:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_POLITE_TEXT_LIST);
                break;
            case NERDY:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_NERDY_TEXT_LIST);
                 break;
            case PIRATE:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_PIRATE_TEXT_LIST);
                break;
            case WIZARD:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_WIZARD_TEXT_LIST);
                break;
            case MOTIVATIONAL:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_MOTIVATIONAL_TEXT_LIST);
                break;
            case AGGRESSIVE:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_AGGRESSIVE_TEXT_LIST);
                break;
            case SANTA:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_SANTA_TEXT_LIST);
                break;
            case RANDOM:
                breakMessage = getRandomPersonalityMessage();
                break;
            default:
                throw new IllegalStateException("Provided personality type is not supported");
        }
        return breakMessage;
    }

    /**
     * Selects random personality from {@link HydrateReminderPersonalityType} except
     * {@link HydrateReminderPersonalityType#RANDOM} and returns message for it.
     *
     * @return message for random personality.
     */
    public static String getRandomPersonalityMessage()
    {
        final List<HydrateReminderPersonalityType> personalityTypes = getPersonalityTypesWithoutRandom();
        final int randomNumber = ThreadLocalRandom.current().nextInt(0, personalityTypes.size());
        final HydrateReminderPersonalityType personalityType = personalityTypes.get(randomNumber);
        return getRandomHydrateBreakMessageForPersonality(personalityType);
    }

    private static List<HydrateReminderPersonalityType> getPersonalityTypesWithoutRandom()
    {
        final List<HydrateReminderPersonalityType> personalityTypes = Arrays.asList(HydrateReminderPersonalityType.values());
        personalityTypes.remove(HydrateReminderPersonalityType.RANDOM);
        return personalityTypes;
    }

}
