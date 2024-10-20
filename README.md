# 🎮 Mystic Mayhem

**Mystic Mayhem** is a turn-based, object-oriented game between two players where each player commands an army consisting of various character classes. Players compete in battles to earn gold, gain experience points (XP), and customize their armies with unique characters and equipment. This is a command-line based game where players interact through text commands to control their actions and make strategic decisions.

```text
===================================|=|=|=|=|=|=|===================================

                             |\    /|
                             ||\  /||
                             || \/ ||  |\    /|
                             ||    ||  ||\  /||
                            _||_  _||_ || \/ ||
                                       ||    ||
                                      _||_  _||_

                               MYSTIC MEYHAM



CREATED BY CYBER DUDES.
===================================|=|=|=|=|=|=|===================================



Press "Enter" to continue....
```

## 📋 Table of Contents

- [🎯 Project Overview](#-project-overview)
- [✨ Features](#-features)
- [🎮 Gameplay Mechanics](#-gameplay-mechanics)
- [⚔️ Character Classes](#️-character-classes)
- [🛡️ Equipment](#️-equipment)
- [⚔️ Battle Rules](#️-battle-rules)
- [🌍 Home Grounds](#-home-grounds)
- [⚙️ Setup Instructions](#️-setup-instructions)
- [🚀 Usage](#-usage)
- [⚔️ Example Battle](#️-example-battle)

## 🎯 Project Overview

Mystic Mayhem allows users to:
- 📝 **Create user profiles** with a unique username.
- 🛡️ **Build an army** with characters such as Archers, Knights, Mages, Healers, and Mythical Creatures.
- ⚙️ **Equip characters** with items to enhance their stats.
- ⚔️ **Engage in battles** with other players to earn rewards and increase their XP.

## ✨ Features

- **User Profiles**: Create a unique username and user ID, which cannot be changed. Players start with 500 gold coins 💰 and can use them to buy characters and equipment.
- **Character Management**: Players can buy characters and equipment for their army using gold coins.
- **Combat System**: Turn-based battles with customizable armies.
- **Home Ground Advantage**: Select a home ground for additional strategic advantages during battles.

## 🎮 Gameplay Mechanics

1. **Creating a Profile**:
   - Users must provide a unique username 🆔 and a name (can be changed later).
   - Users start with 500 gold coins 💰.
   - Additional coins are earned by winning battles 🏅.

2. **Building an Army**:
   - Players must have exactly one character from each of the following categories: Archer 🏹, Knight 🛡️, Mage 🔮, Healer 💊, and Mythical Creature 🐉.
   - Characters come with stats for attack ⚔️, defense 🛡️, health ❤️, and speed 🏃.
   - Players can sell characters for 90% of their value if they wish to replace them.

3. **Earning Gold**:
   - Players can earn gold by winning battles, receiving 10% of the defeated player's gold 💰.
   - In case of a draw 🤝, no coins are exchanged.

## ⚔️ Character Classes

Here is a complete list of the characters available in each category:

| Category             | Name          | Price (gc) | ⚔️ Attack | 🛡️ Defense | ❤️ Health | 🏃 Speed |
|----------------------|---------------|------------|-----------|------------|-----------|----------|
| **Archer** 🏹         | Shooter       | 80         | 11        | 4          | 6         | 9        |
|                      | Ranger        | 115        | 14        | 5          | 8         | 10       |
|                      | Sunfire       | 160        | 15        | 5          | 7         | 10       |
|                      | Zing          | 200        | 16        | 9          | 11        | 14       |
|                      | Saggitarius   | 230        | 18        | 7          | 12        | 17       |
| **Knight** 🛡️         | Squire        | 85         | 8         | 9          | 7         | 8        |
|                      | Cavalier      | 110        | 10        | 12         | 7         | 10       |
|                      | Templar       | 155        | 14        | 16         | 12        | 12       |
|                      | Zoro          | 180        | 17        | 16         | 13        | 14       |
|                      | Swiftblade    | 250        | 18        | 20         | 17        | 13       |
| **Mage** 🔮           | Warlock       | 100        | 12        | 7          | 10        | 12       |
|                      | Illusionist   | 120        | 13        | 8          | 12        | 14       |
|                      | Enchanter     | 160        | 16        | 10         | 13        | 16       |
|                      | Conjurer      | 195        | 18        | 15         | 14        | 12       |
|                      | Eldritch      | 270        | 19        | 17         | 18        | 14       |
| **Healer** 💊         | Soother       | 95         | 10        | 8          | 9         | 6        |
|                      | Medic         | 125        | 12        | 9          | 10        | 7        |
|                      | Alchemist     | 250        | 13        | 13         | 13        | 13       |
|                      | Saint         | 200        | 16        | 14         | 17        | 9        |
|                      | Lightbringer  | 260        | 17        | 15         | 19        | 12       |
| **Mythical Creature** 🐉 | Dragon    | 120        | 12        | 14         | 15        | 8        |
|                      | Basilisk      | 165        | 15        | 11         | 10        | 12       |
|                      | Hydra         | 205        | 12        | 16         | 15        | 11       |
|                      | Phoenix       | 275        | 17        | 13         | 17        | 19       |
|                      | Pegasus       | 340        | 14        | 18         | 20        | 20       |

## 🛡️ Equipment

Players can purchase equipment to enhance their characters' stats. Each character can have one piece of armour 🛡️ and one artefact ✨.

| Type       | Name         | Price (gc) | ⚔️ Attack | 🛡️ Defense | ❤️ Health | 🏃 Speed |
|------------|--------------|------------|-----------|------------|-----------|----------|
| **Armour** 🛡️ | Chainmail | 70         | -         | +1         | -         | -1       |
|            | Regalia      | 105        | -         | +1         | -         | -        |
|            | Fleece       | 150        | -         | +2         | +1        | -1       |
| **Artefact** ✨ | Excalibur | 150      | +2        | -          | -         | -        |
|            | Amulet       | 200        | +1        | -1         | +1        | +1       |
|            | Crystal      | 210        | +2        | +1         | -1        | -1       |

*Note*: Wielding equipment increases the character's value by 20% of the equipment's price.

## ⚔️ Battle Rules

- Battles are turn-based, with characters attacking in order of speed 🏃.
- The player who declares war ⚔️ attacks first.
- Players can take up to 10 turns.
- If a player defeats all opposing characters, they win 🎉. If both armies are standing after 10 turns, it’s a draw 🤝.
- Attack calculations consider the attacker's power and the defender's defense.
- Healers focus on restoring the health ❤️ of their own team rather than attacking.

## 🌍 Home Grounds

Players can choose a home ground for battles, each providing strategic advantages:

- **Hillcrest** ⛰️: Boosts attack and defense for highlanders. Highlanders get a bonus turn with 20% attack power.
- **Marshland** 🌿: Increases marshlanders' defense by 2 but decreases the attack of sun children by 1.
- **Desert** 🏜️: Enhances sun children's attack by 1 but decreases marshlanders' health by 1.
- **Arcane** 🔮: Improves mystics' attack by 2 but reduces the speed and defense of highlanders and marshlanders.

## ⚙️ Setup Instructions

Clone the Repository:

```bash
git clone https://github.com/your-username/mystic-mayhem.git
cd mystic-mayhem
```

- To Play:

Click the exe file in the downloaded repository to start the game.

- To Run Manually:

     - Ensure you have Java installed.
     - Compile and run the game manually:

```bash
cd SourceCodes
javac -d bin src/Main.java
java -cp bin Main
```

## 🚀 Usage

1. Create a user profile 📝.
2. Build your army using gold coins 💰.
3. Equip characters with items for a strategic advantage ⚙️.
4. Challenge other players and engage in turn-based combat

## ⚔️ Example Battle

<details>
<summary>Click to see!</summary>

```text
===================================|=|=|=|=|=|=|===================================

                             |\    /|
                             ||\  /||
                             || \/ ||  |\    /|
                             ||    ||  ||\  /||
                            _||_  _||_ || \/ ||
                                       ||    ||
                                      _||_  _||_

                               MYSTIC MEYHAM



CREATED BY CYBER DUDES.
===================================|=|=|=|=|=|=|===================================



Press "Enter" to continue....

Enter your name : Induwara
Enter your UserName : indu2255



 ------------ YOU HAVE CREATED YOUR USER PROFILE SUCCESSSFULLY -------------


 NOW YOU HAVE TO CREATE YOUR OWN ARMY IN ORDER TO BATTLE


 YOU HAVE TO SELECT 5 CHARACTERS TO COMPLETE THE ARMY
 ************ TIP: USE YOUR COINS EFFICIENTLY TO BUY CHARACTERS *************

 IF YOU DON'T HAVE COINS TO FULLFILL THE ARMY,
YOU WILL BE REDIRECTED TO THE INITIAL PAGE TO CHOOSE THE ARMY AGAIN FROM THE BEGINING...
Let's Create your Army


                             Gold Coins : 500
=======================================================================================================================
                                                      ARCHERS
=======================================================================================================================

 1).                     2).                      3).                       4).                      5).
 Name: Shooter           Name:  Ranger            Name: Sunfire             Name: Zing               Name: Saggitarius
 Price: 80 gc            Price: 115 gc            Price: 160 gc             Price: 200 gc            Price: 230 gc
 Attack: 11              Attack: 14               Attack: 15                Attack: 16               Attack: 18
 Defence: 4              Defence: 5               Defence: 5                Defence: 9               Defence: 7
 Health: 6               Health: 8                Health: 7                 Health: 11               Health: 12
 Speed: 9                Speed: 10                Speed: 14                 Speed: 14                Speed: 17


Choose your preference:  1


                             Gold Coins : 420
=======================================================================================================================
                                                     KNIGHTS
=======================================================================================================================

 1).                     2).                      3).                       4).                      5).
 Name: Squire            Name: Cavalier           Name: Templar             Name: Zoro               Name: Swiftblade
 Price: 85 gc            Price: 110 gc            Price: 155 gc             Price: 180 gc            Price: 250 gc
 Attack: 8               Attack: 10               Attack: 14                Attack: 17               Attack: 18
 Defence: 9              Defence: 12              Defence: 16               Defence: 16               Defence: 20
 Health: 7               Health: 7                Health: 12                Health: 13               Health: 17
 Speed: 8                Speed: 10                Speed: 12                 Speed: 14                Speed: 13


Choose your preference:  1


                             Gold Coins : 335
=======================================================================================================================
                                                      MAGES
=======================================================================================================================

 1).                     2).                      3).                       4).                      5).
 Name: Warlock           Name:  Illusionist       Name: Enchanter            Name: Conjurer           Name: Eldritch
 Price: 100 gc           Price: 120 gc            Price: 160 gc              Price: 195 gc            Price: 270 gc
 Attack: 12              Attack: 13               Attack: 16                 Attack: 18               Attack: 19
 Defence: 7              Defence: 8               Defence: 10                Defence: 15              Defence: 17
 Health: 10              Health: 12               Health: 13                 Health: 14               Health: 18
 Speed: 12               Speed: 14                Speed: 16                  Speed: 12                Speed: 14


Choose your preference:  1


                             Gold Coins : 235
=======================================================================================================================
                                                      HEALERS
=======================================================================================================================

 1).                     2).                      3).                       4).                      5).
 Name: Soother           Name: Medic              Name: Alchemist            Name: Saint              Name: Lightbringer
 Price: 95 gc            Price: 125 gc            Price: 150 gc              Price: 200 gc            Price: 260 gc
 Attack: 10              Attack: 12               Attack: 13                 Attack: 16               Attack: 17
 Defence: 8              Defence: 9               Defence: 13                Defence: 14              Defence: 15
 Health: 9               Health: 10               Health: 13                 Health: 17               Health: 19
 Speed: 6                Speed: 7                 Speed: 13                  Speed: 9                 Speed: 12


Choose your preference:  1


                             Gold Coins : 140
=======================================================================================================================
                                                 MYTHICAL CREATURE
=======================================================================================================================

 1).                     2).                      3).                       4).                      5).
 Name: Dragon            Name: Basilisk           Name: Hydra               Name: Phoenix            Name: Pegasus
 Price: 120 gc           Price: 165 gc            Price: 205 gc             Price: 275 gc            Price: 340 gc
 Attack: 12              Attack: 15               Attack: 12                Attack: 17               Attack: 14
 Defence: 14             Defence: 11              Defence: 16               Defence: 13              Defence: 18
 Health: 15              Health: 10               Health: 15                Health: 17               Health: 20
 Speed: 8                Speed: 12                Speed: 11                 Speed: 19                Speed: 20


Choose your preference:  1
... ALL SET FOR THE BATTLE...



 YOU HAVE SUCCESSFULLY CREATED THE ARMY....


LET'S CHOOCE A HOMEGROUND:
    1.HILLCREST
    2.MARSHLAND
    3.DESERT
    4.ARCANE
Enter your choice: 2

 ...LET'S SEARCH FOR A OPPONENT TO BATTLE ..........

OPPONENT IS FOUND!!!

Opponent name: GeraltofRivia Opponent XP: 32

1.  Attack
2.  Skip

WOULD YOU LIKE TO BATTLE WITH THIS OPPONENT OR SKIP NOW?
Enter an option: 1

Battle is Declared !!!
Induwara vs. GeraltofRivia
=====================================================================================
            Turn 1: Induwara
Warlock attacks Ranger
Ranger's health: 2.6
Warlock's health: 10.0

             Turn 1: GeraltofRivia
Warlock attacks Shooter
Shooter's health: 0.4
Warlock's health: 10.0
=====================================================================================
            Turn 2: Induwara
Warlock attacks Ranger
Ranger's health: 0.0
Warlock's health: 10.0

Ranger died!!!

             Turn 2: GeraltofRivia
Warlock attacks Shooter
Shooter's health: 0.0
Warlock's health: 10.0

Shooter died!!!
=====================================================================================
            Turn 3: Induwara
Warlock attacks Medic
Medic's health: 5.8
Warlock's health: 10.0

             Turn 3: GeraltofRivia
Warlock attacks Soother
Soother's health: 3.8
Warlock's health: 10.0
=====================================================================================
            Turn 4: Induwara
Warlock attacks Medic
Medic's health: 0.6
Warlock's health: 10.0

             Turn 4: GeraltofRivia
Warlock attacks Soother
Soother's health: 0.0
Warlock's health: 10.0

Soother died!!!
=====================================================================================
            Turn 5: Induwara
Warlock attacks Medic
Medic's health: 0.0
Warlock's health: 10.0

Medic died!!!

             Turn 5: GeraltofRivia
Warlock attacks Warlock
Warlock's health: 4.9
Warlock's health: 10.0
=====================================================================================
            Turn 6: Induwara
Warlock attacks Warlock
Warlock's health: 4.9
Warlock's health: 4.9

             Turn 6: GeraltofRivia
Warlock attacks Warlock
Warlock's health: 0.0
Warlock's health: 4.9

Warlock died!!!
=====================================================================================
            Turn 7: Induwara
Squire attacks Warlock
Warlock's health: 1.8
Squire's health: 7.0

             Turn 7: GeraltofRivia
Warlock attacks Squire
Squire's health: 2.1
Warlock's health: 1.8
=====================================================================================
            Turn 8: Induwara
Squire attacks Warlock
Warlock's health: 0.0
Squire's health: 2.1

Warlock died!!!

             Turn 8: GeraltofRivia
Squire attacks Squire
Squire's health: 0.0
Squire's health: 7.0

Squire died!!!
=====================================================================================
            Turn 9: Induwara
Dragon attacks Squire
Squire's health: 2.6
Dragon's health: 15.0

             Turn 9: GeraltofRivia
Squire attacks Dragon
Dragon's health: 12.4
Squire's health: 2.6
=====================================================================================
            Turn 10: Induwara
Dragon attacks Squire
Squire's health: 0.0
Dragon's health: 12.4

Squire died!!!

             Turn 10: GeraltofRivia
Dragon attacks Dragon
Dragon's health: 8.3
Dragon's health: 15.0

Match Draw!!!!!

Induwara Xp: 0 gold coins: 20
GeraltofRivia Xp: 32 gold coins: 215


===================================|o|O|O|O|O|o|===================================
<><><><><><><><><><><                MAIN MENU                ><><><><><><><><><><>
===================================|o|O|O|O|O|o|===================================

    1. VIEW PROFILE
    2. CHANGE PLAYER CHARACTERISTIC
    3. INVENTORY
    4. START A COMBAT
    0. EXIT

Enter your option:

```
</details>
