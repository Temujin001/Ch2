public class Healer {
    
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
        maxhealth = 16;
        health = maxhealth;
        attack = 4;
        defense = 6;
        magicAttack = 5;
        magicDefense = 10;
        agility = 3;
        wisdom = 12;
    }
    public Warrior(String n, int lev) {
        name = n;
        level = lev;
        maxhealth = 16*lev;
        health = maxhealth;
        attack = 4*lev;
        defense = 6*lev;
        magicAttack = 5*lev;
        magicDefense = 10*lev;
        agility = 3*lev;
        wisdom = 12*lev;
    }
        
}