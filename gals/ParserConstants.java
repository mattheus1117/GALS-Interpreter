package gals;

public interface ParserConstants
{
    int FIRST_SEMANTIC_ACTION = 21;

    int SHIFT  = 0;
    int REDUCE = 1;
    int ACTION = 2;
    int ACCEPT = 3;
    int GO_TO  = 4;
    int ERROR  = 5;

    int[][][] PARSER_TABLE = new LRTableAdapter().table;

    public class LRTableAdapter // Code too large sem adapter (>64kb)
    {
        int table[][][] = new int[33][21][2];

        public class state0{ int q0[][] = { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  3}, {SHIFT ,  4}, {GO_TO ,  1}, {GO_TO ,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state1{ int q1[][] = { {ACCEPT,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state2{ int q2[][] = { {REDUCE,  1}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  3}, {SHIFT ,  4}, {GO_TO ,  5}, {GO_TO ,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state3{ int q3[][] = { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state4{ int q4[][] = { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state5{ int q5[][] = { {REDUCE,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state6{ int q6[][] = { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state7{ int q7[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 13}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  9}, {GO_TO , 10}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0} }; }
        public class state8{ int q8[][] = { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 17}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state9{ int q9[][] = { {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 19}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 18}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state10{ int q10[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  6}, {REDUCE,  6}, {SHIFT , 21}, {SHIFT , 22}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  6}, {ERROR ,  0}, {REDUCE,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state11{ int q11[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  9}, {ERROR ,  0}, {REDUCE,  9}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state12{ int q12[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 12}, {REDUCE, 12}, {REDUCE, 12}, {REDUCE, 12}, {SHIFT , 23}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 12}, {ERROR ,  0}, {REDUCE, 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state13{ int q13[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 24}, {ERROR ,  0} }; }
        public class state14{ int q14[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 13}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 25}, {GO_TO , 10}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0} }; }
        public class state15{ int q15[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 14}, {ERROR ,  0}, {REDUCE, 14}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state16{ int q16[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 15}, {ERROR ,  0}, {REDUCE, 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state17{ int q17[][] = { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 26}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state18{ int q18[][] = { {REDUCE,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  3}, {REDUCE,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state19{ int q19[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 13}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 27}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0} }; }
        public class state20{ int q20[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 13}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 28}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0} }; }
        public class state21{ int q21[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 29}, {ERROR ,  0} }; }
        public class state22{ int q22[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 30}, {ERROR ,  0} }; }
        public class state23{ int q23[][] = { {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 13}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 31}, {GO_TO , 12}, {ERROR ,  0} }; }
        public class state24{ int q24[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 11}, {REDUCE, 11}, {REDUCE, 11}, {REDUCE, 11}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 11}, {ERROR ,  0}, {REDUCE, 11}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state25{ int q25[][] = { {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 19}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 32}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state26{ int q26[][] = { {REDUCE,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  2}, {REDUCE,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state27{ int q27[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  4}, {REDUCE,  4}, {SHIFT , 21}, {SHIFT , 22}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  4}, {ERROR ,  0}, {REDUCE,  4}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state28{ int q28[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  5}, {REDUCE,  5}, {SHIFT , 21}, {SHIFT , 22}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  5}, {ERROR ,  0}, {REDUCE,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state29{ int q29[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  7}, {ERROR ,  0}, {REDUCE,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state30{ int q30[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  8}, {ERROR ,  0}, {REDUCE,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state31{ int q31[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 10}, {ERROR ,  0}, {REDUCE, 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }
        public class state32{ int q32[][] = { {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 13}, {ERROR ,  0}, {REDUCE, 13}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }; }

        public LRTableAdapter(){
            table[0] = new state0().q0;
            table[1] = new state1().q1;
            table[2] = new state2().q2;
            table[3] = new state3().q3;
            table[4] = new state4().q4;
            table[5] = new state5().q5;
            table[6] = new state6().q6;
            table[7] = new state7().q7;
            table[8] = new state8().q8;
            table[9] = new state9().q9;
            table[10] = new state10().q10;
            table[11] = new state11().q11;
            table[12] = new state12().q12;
            table[13] = new state13().q13;
            table[14] = new state14().q14;
            table[15] = new state15().q15;
            table[16] = new state16().q16;
            table[17] = new state17().q17;
            table[18] = new state18().q18;
            table[19] = new state19().q19;
            table[20] = new state20().q20;
            table[21] = new state21().q21;
            table[22] = new state22().q22;
            table[23] = new state23().q23;
            table[24] = new state24().q24;
            table[25] = new state25().q25;
            table[26] = new state26().q26;
            table[27] = new state27().q27;
            table[28] = new state28().q28;
            table[29] = new state29().q29;
            table[30] = new state30().q30;
            table[31] = new state31().q31;
            table[32] = new state32().q32;
        }
    }

    int[][] PRODUCTIONS =
    {
        { 15, 2 },
        { 15, 1 },
        { 16, 5 },
        { 16, 4 },
        { 17, 3 },
        { 17, 3 },
        { 17, 1 },
        { 18, 3 },
        { 18, 3 },
        { 18, 1 },
        { 19, 3 },
        { 19, 2 },
        { 19, 1 },
        { 20, 3 },
        { 20, 1 },
        { 20, 1 }
    };

    String[] PARSER_ERROR =
    {
        "Erro estado 0",
        "Erro estado 1",
        "Erro estado 2",
        "Erro estado 3",
        "Erro estado 4",
        "Erro estado 5",
        "Erro estado 6",
        "Erro estado 7",
        "Erro estado 8",
        "Erro estado 9",
        "Erro estado 10",
        "Erro estado 11",
        "Erro estado 12",
        "Erro estado 13",
        "Erro estado 14",
        "Erro estado 15",
        "Erro estado 16",
        "Erro estado 17",
        "Erro estado 18",
        "Erro estado 19",
        "Erro estado 20",
        "Erro estado 21",
        "Erro estado 22",
        "Erro estado 23",
        "Erro estado 24",
        "Erro estado 25",
        "Erro estado 26",
        "Erro estado 27",
        "Erro estado 28",
        "Erro estado 29",
        "Erro estado 30",
        "Erro estado 31",
        "Erro estado 32"
    };

}