#pragma once
#include <iostream>	
using namespace std;

class Character {
protected:
    string name;
    int hp;
    int damage;

public:
    Character(string pName, int pHp, int pDamage);
    virtual ~Character() {}

    virtual void attack(Character& target);
    virtual void specialAttack(Character& target);
    virtual void takeDamage(int amount);
    bool isAlive() const;
    virtual string getStatus();

    int getDamage() const { return damage; }
};
