/**
 * @메쏘드명 : DefinitionCode
 * @작성자 : jwt1029
 * @작성일자 : 2018-10-15
 * @설명 :
 */
public final class DefinitionCode {
    public DefinitionCode() {}

    public enum AREA_CODE {
        A(1),
        B(2),
        C(3),
        D(4),
        E(5),
        F(6),
        G(7),
        H(8),
        ZERO(0);

        private int value;

        private AREA_CODE(int value) {
            this.value = value;
        }
        public String getName() {
            return this.toString();
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MAP_SIZE {
        SMALL(10, 12),
        MIDIUM(16, 18),
        LARGE(20, 22);

        private int[] value = new int[2];

        private MAP_SIZE(int x, int y) {
            this.value[0] = x;
            this.value[1] = y;
        }
        public String getName() {
            return this.toString();
        }

        public int[] getValue() {
            return this.value;
        }
    }
}
