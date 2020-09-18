public class Warrior {
    
private int attack;
private String name;
private int level;
private int maxhealth;
private int health;
private int defense;
private int magicAttack;
private int magicDefense;
private int agility;
private int wisdom;

    public Warrior(String n){
        name = n;
        level = 1;
        maxhealth = 20;
        health = maxhealth;
        attack = 10;
        defense = 0;
        magicAttack = 0;
        magicDefense = 4;
        agility = 7;
        wisdom = 2;
    }
    public Warrior(String n, int lev) {
        name = n;
        level = lev;
        maxhealth = 20*lev;
        health = maxhealth;
        attack = 10*lev;
        defense = 8*lev;
        magicAttack = 0*lev;
        magicDefense = 4*lev;
        agility = 7*lev;
        wisdom = 2*lev;
    }
        
}