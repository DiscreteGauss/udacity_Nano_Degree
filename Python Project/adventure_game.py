import time as t
import random as ran


def intro_design():  # Print my intro with my name and heading
    print("*"*30)
    print("*" + " " * 28 + "*")
    print("*" + " " * 7 + "Py Adventure!" + " " * 8 + "*")
    print("*" + " " * 7 + "Mike Riano" + " " * 11 + "*")
    print("*" + " " * 2 + "Udacity Cognizant Degree" + " " * 2 + "*")
    print("*" + " " * 28 + "*")
    print("*"*30)


def creature():  # Random creature selection
    monster_selection = ["dragon", "troll", "goblin", "dwarf",
                         "orc", "grunt", "skeleton"]
    monster = ran.choice(monster_selection)
    return monster


def weapons():  # Random weapons selection
    weapon_selection = ["sword", "magic wand", "dagger", "bow", "greataxe"]
    weapon = ran.choice(weapon_selection)
    return weapon


def print_pause(string):  # pauses, new line,delay txt& spacing
    print(string, end='\n\n')
    t.sleep(2)


def valid_input(prompt, option1, option2):  # Checks input & validate input
    while True:
        response = input(prompt)
        if option1 == response:
            break
        elif option2 == response:
            break
        else:
            print_pause("\nSorry,please make one of the 2 choices: ")
    return response


def intro():  # Simple intro to the game.
    print_pause("""\nYou awaken to a new world you are unfamiliar with.
    There is a sense of dread and excitement in the air.""")
    print_pause("You have no idea how you have gotten here or why.")
    print_pause("""Rather than wonder what is going on,
    you decide something must be done!""")
    print_pause("You must find a way home.")


def cave():  # choices / what happens in the cave.
    print_pause("""You make your way through a cave stumbling
     over rocks and slick terrain.""")
    print_pause("""You're tired of the stench, hungry.
    Proceeding forward you see a detour.""")
    print_pause("You are presented with 2 options:")
    cave_response = valid_input("""Please Choose\n
    1: Walk left toward what looks like sun light
    and the smell of fresh air. \n
    2: Walk right toward what appears to be a path leading upwards.
    Hard to see what follows.\n
    Please choose: 1 or 2: """, "1", "2")
    if cave_response == "1":
        print_pause(f"""\nYou stumble into a large
         cavern with a {creature()} facing you.""")
        print_pause("""Run! Run back you cannot tango with this monster today!
        You go back and retrace your steps and find a way out.""")
    elif cave_response == "2":
        print_pause("\nAs you venture forward, great scott!...it's the exit.")
        print_pause("""Excitedly, you feel the warmth of the sun on your face.
        Time to press on.""")


def field():  # choices / what happens in the field.
    your_weapon = weapons()
    print_pause("You approach an open field. The wind feels great!")
    print_pause(f"""You see a {your_weapon}!
    You are feeling a little safer with some remote protection!""")
    print_pause(f"You hear a scurry in the distance.")
    print_pause(f"You see something fast approaching! It's a {creature()}!")
    field_response = valid_input("""Please Choose\n
    1: Do you stay and fight? \n
    2: Do you run and live to tell the tale another day?\n
    Please choose: 1 or 2: """, "1", "2")
    if field_response == "1":
        print_pause(f"""\nYou fumble to find your strength and intellect.
        Bearing your {your_weapon} you attack successfully
        defeating the monster!""")
        print_pause("Triumphantly, you press on!")
    elif field_response == "2":
        print_pause("""\nAs you run away, you no
        longer hear the monster chasing you.""")
        print_pause("""You take a moment to catch your breath,
        until that is the monster has returned.""")
        print_pause("""The monster reaches for
        you and manages to land a slight blow.""")
        print_pause("""You unfortunately are now injured
        making your adventure much harder to procced.""")
        print_pause("You press on injuries and all.")


def home():  # choices / what happens at the home.
    print_pause("You see a home that looks like yours in the distance.")
    print_pause(f"""You recall being with your
    family, just having dinner and dozing off.""")
    print_pause(f"""You enter the home looking through
    everything just as if you were back on your world.""")
    print_pause(f"You have a feeling of peace and calm.")
    home_response = valid_input("""You see your bed.
    You feel like you should rest.\n
    1: Do you stay and sleep? \n
    2: Do you move on looking elsewhere for ways to get home?\n
    Please choose: 1 or 2: """, "1", "2")
    if home_response == "1":
        print_pause(f"""\nYou drift off and awake
         to being in your bed back on your world.""")
        print_pause("""You apparently were dreaming
        and were never in another world from the start.""")
        print_pause("""With the alarm going off,
        you realize it's time to get up and go to work.""")
        print_pause("Thank you for playing!")
    elif home_response == "2":
        print_pause("\nYou decide now is not the time for sleeping.")
        print_pause("""You take a ponder on the idea of
        being home and actually sleeping safely in your bed.""")
        print_pause("Heroes don't have time to daydream nor do you!")
        print_pause("Time to move on!")
        print_pause("""As time passes on aimlessly,
         your mind rots away not realizing you were in fact
         sleeping in bed and will be late for work!""")
        print_pause("Your real life adventure beings!")
        print_pause("Thank you for playing!")


def play_again():  # Play again and loop to restart/end
    game_response = valid_input("""Would you like to play again?\n
    1: Yes \n
    2: No\n
    Please choose: 1 or 2: """, "1", "2")
    if game_response == "1":
        intro()
        cave()
        field()
        home()
        play_again()
    elif game_response == "2":
        print_pause("\nThank you so much for playing")
        print_pause("I hope you had fun!")
        print_pause("Have a nice day, goodbye!")
        intro_design()


intro_design()
intro()
cave()
field()
home()
play_again()
