#pragma once
#include "Character.h"
#include <iostream>
using namespace std;

class Boss : public Character {
private:
    int specialAttackDamage;

public:
    Boss(string pName, int pHp, int pDamage, int pSpecialAttackDamage);
    void attack(Character& target) override;
};
