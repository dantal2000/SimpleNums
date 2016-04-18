package Generator;

interface Model {
    int getSimpleInRange(int start, int end) throws Exception;

    boolean isSimple(int num);

    int[] getSimplesInRange(int start, int end) throws Exception;
}
