// GetterAndSetter.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include "Character.h"
#include "Boss.h"

using namespace std;

int main() {
    srand(time(0)); 

    Character hero("Aragorn", 100, 25);
    Character enemy("Sauron", 100, 20);
    Boss finalBoss("Balrog", 150, 40, 50);
    bool defending = false;

    auto battle = [&](Character& player, Character& opponent) {
        while (player.isAlive() && opponent.isAlive()) {
            int choice;
            cout << "\nTurno de " << player.getStatus() << "\n";
            cout << "1. Atacar\n2. Defender\nElige una opcion: ";
            cin >> choice;

            if (choice == 1) {
                if (rand() % 5 == 0) {
                    player.specialAttack(opponent);
                }
                else {
                    player.attack(opponent);
                }
            }
            else if (choice == 2) {
                cout << player.getStatus() << " se prepara para defenderse en el proximo turno.\n";
                defending = true;
            }
            else {
                cout << "Opción invalida. Pierdes tu turno.\n";
            }

            if (opponent.isAlive()) {
                if (defending) {
                    cout << player.getStatus() << " reduce el dano a la mitad.\n";
                    player.takeDamage(opponent.getDamage() / 2);
                    defending = false;
                }
                else {
                    opponent.attack(player);
                }
            }
        }
        };

    cout << "\nBatalla contra " << enemy.getStatus()<< endl;
    battle(hero, enemy);

    if (!hero.isAlive()) {
        cout << "\nHas sido derrotado... Fin del juego." << endl;
        return 0;
    }

    cout << "\nHas vencido a " << enemy.getStatus() << endl;
    cout << "\nAhora enfrentas al BOSS: " << finalBoss.getStatus() << endl;

    battle(hero, finalBoss);

    if (hero.isAlive()) {
        cout << "\nHas derrotado al BOSS! Eres el campeon!" << endl;
    }
    else {
        cout << "\nEl BOSS te ha vencido... Fin del juego." << endl;
    }

    return 0;
}

