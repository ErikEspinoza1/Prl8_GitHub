#include "Character.h"
#include <iostream>
using namespace std;	
#include <string>

Character::Character(string pName, int pHp, int pDamage)
    : name(pName), hp(pHp), damage(pDamage) {
}

void Character::attack(Character& target) {
    cout << name << " ataca y hace " << damage << " de dano!" << endl;
    target.takeDamage(damage);
}

void Character::specialAttack(Character& target) {
    int specialDamage = damage * 2;
    cout << name << " usa su ATAQUE ESPECIAL y hace " << specialDamage << " de dano!" << endl;
    target.takeDamage(specialDamage);
}

void Character::takeDamage(int amount) {
    hp -= amount;
    if (hp < 0) hp = 0;
}

bool Character::isAlive() const {
    return hp > 0;
}

string Character::getStatus() {
    return "Character Status:\n  Name: " + name + "\n  HP: " + to_string(hp) + "\n  Damage: " + to_string(damage);
}