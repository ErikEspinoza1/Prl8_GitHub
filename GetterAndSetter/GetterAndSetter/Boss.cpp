#include "Boss.h"
#include <iostream>
#include <string>
using namespace std;


Boss::Boss(string pName, int pHp, int pDamage, int pSpecialAttackDamage)
    : Character(pName, pHp, pDamage), specialAttackDamage(pSpecialAttackDamage) {
}

void Boss::attack(Character& target) {
    if (rand() % 3 == 0) { // 33% de probabilidad de ataque especial
        cout << name << " usa su ataque especial y hace " << specialAttackDamage << " de dano!" << endl;
        target.takeDamage(specialAttackDamage);
    }
    else {
        Character::attack(target);
    }
}
