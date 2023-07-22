public class Main {
    public static void main(String[] args){
        HavingSuperAbility[] heroes = {new Magic(), new Medic(20), new Warrior()};
        for (HavingSuperAbility heroe : heroes) {
            heroe.applySuperAbility();

            if(heroe instanceof Medic){
                Medic medic = (Medic) heroe;
                medic.increaseExperience();
            }
        }
    }
}
