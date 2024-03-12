// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Random;

// public class Battle {

//     private static final int MAX_TURNS = 10;

//     public void startWar(Player player1, Player player2) {
//         List<Army> player1Army = player1.getArmy(); //list
//         List<Army> player2Army = player2.getArmy();

//         // Sort armies by speed in descending order
//         sortArmiesBySpeed(player1Army);
//         sortArmiesBySpeed(player2Army);

//         // Determine the player who takes the first turn
//         boolean player1First = determineFirstPlayer(player1Army, player2Army);

//         for (int turn = 1; turn <= MAX_TURNS; turn++) {
//             System.out.println("Turn " + turn);

//             // Perform attacks for each player
//             performAttacks(player1, player2, player1Army, player2Army, player1First);
//             performAttacks(player2, player1, player2Army, player1Army, !player1First);

//             // Check for battle end conditions
//             if (isBattleOver(player1Army) || isBattleOver(player2Army)) {
//                 break;
//             }
//         }

//         // Restore armies to their initial state after the battle
//         player1.restoreArmy();
//         player2.restoreArmy();
//     }

//     private void sortArmiesBySpeed(List<Army> army) {
//         army.sort(Comparator.comparingInt(Army::getSpeed).reversed());
//     }

//     private boolean determineFirstPlayer(List<Army> player1Army, List<Army> player2Army) {
//         return player1Army.get(0).getSpeed() >= player2Army.get(0).getSpeed();
//     }

//     private void performAttacks(Player attacker, Player defender, List<Army> attackingArmy,
//                                 List<Army> defendingArmy, boolean firstPlayer) {
//         for (Army attackerCharacter : attackingArmy) {
//             if (attackerCharacter.getHealth() <= 0) {
//                 continue; // Skip dead characters
//             }

//             // Determine the target based on home ground effects
//             Army target = determineTarget(defender, defendingArmy, firstPlayer);

//             // Perform attack based on character type
//             if (attackerCharacter instanceof Healer) {
//                 performHealerAttack((Healer) attackerCharacter, attacker, attackingArmy);
//             } else {
//                 performNormalAttack(attackerCharacter, target);
//             }

//             // Check for battle end conditions after each attack
//             if (isBattleOver(defendingArmy)) {
//                 break;
//             }
//         }
//     }

//     private Army determineTarget(Player defender, List<Army> defendingArmy, boolean firstPlayer) {
//         // Implement logic to determine the target based on home ground effects and priorities
//         // ...

//         // For now, target the first character in the defending army
//         return defendingArmy.get(0);
//     }

//     private void performNormalAttack(Army attacker, Army target) {
//         double damage = 0.5 * attacker.getAttack() - 0.1 * target.getDefence();
//         target.reduceHealth(damage);
//         System.out.println(attacker.getName() + " attacks " + target.getName() + " for " + damage + " damage.");
//     }

//     private void performHealerAttack(Healer healer, Player attacker, List<Army> attackingArmy) {
//         Army target = getLowestHealthCharacter(attackingArmy);
//         double healing = 0.1 * healer.getAttack();
//         target.increaseHealth(healing);
//         System.out.println(healer.getName() + " heals " + target.getName() + " for " + healing + " health.");
//     }

//     private Army getLowestHealthCharacter(List<Army> army) {
//         return Collections.min(army, Comparator.comparingDouble(Army::getHealth));
//     }

//     private boolean isBattleOver(List<Army> army) {
//         // Check if all characters in the army are dead
//         return army.stream().allMatch(character -> character.getHealth() <= 0);
//     }
// }
