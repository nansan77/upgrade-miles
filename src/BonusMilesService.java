public class BonusMilesService {
    public int calculate(int cost) {
        int each =20;
        int bonus = 1;
        int result = cost / each * bonus;
        int totol = (int)result;

        return totol;
    }
}
