public class Medic extends Hero{
    private int healPoints;
    public void applySuperAbility(){
        System.out.println("Medic applied super ability: Healing");
    }

    public Medic(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        healPoints += healPoints*0.1;
        System.out.println("Medic increased healing experience to " + healPoints);
    }
}
