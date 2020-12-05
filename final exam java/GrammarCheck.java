public class GrammarCheck {

    public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `grammarCheck` névvel,
    amely egy string-et (`text`) vár paraméterként,
    és ellenőrzi, hogy a kapott string-ben a `.` írásjelek után
    az első betűk mindenhol nagybetűk-e.
    A választ a függvény egy boolean (logikai) értékként adja vissza.

    Példák: */

        System.out.println(grammarCheck("Ez egy jó példa. Ez egy jó példa."));

        //Amivel vissza kell térnie: `true`.

        System.out.println(grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik."));

        //Amivel vissza kell térnie: `true`.

        System.out.println(grammarCheck("Ez egy rossz példa. itt nincs nagybetű."));

        // Amivel vissza kell térnie: `false`.

    }

    public static boolean grammarCheck(String text) {
        for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == '.' && text.charAt(i + 2) != text.toUpperCase().charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}

