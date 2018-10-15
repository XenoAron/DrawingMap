/**
 * @메쏘드명 : UnionMap
 * @작성자 : jwt1029
 * @작성일자 : 2018-10-15
 * @설명 :
 */
public class UnionMap {
    private int[][] unionMap;

    public UnionMap(DefinitionCode.MAP_SIZE mapSize) {
        Integer maxX = mapSize.getValue()[0];
        Integer maxY = mapSize.getValue()[1];
        // 최대 사이즈에 맞게 배열 초기화
        this.unionMap = new int[maxX][maxY];

        // 외부 영역 맵핑
        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[i][j] = DefinitionCode.AREA_CODE.A.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[maxX - 1 - i][j] = DefinitionCode.AREA_CODE.B.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[i][maxY - 1 - j] = DefinitionCode.AREA_CODE.C.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[maxX - 1 - i][maxY - 1 - j] = DefinitionCode.AREA_CODE.D.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[maxX / 2 - 1 - i][maxY / 2 - 1 - j] = DefinitionCode.AREA_CODE.E.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[maxX / 2 - 1 - i][maxY / 2 + j] = DefinitionCode.AREA_CODE.F.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[maxX / 2 + i][maxY / 2 - 1 - j] = DefinitionCode.AREA_CODE.G.getValue();
            }
        }

        for (int i = 0; i < maxX / 2; i++) {
            for (int j = 0; j <= i; j++) {
                this.unionMap[maxX / 2 + i][maxY / 2 + j] = DefinitionCode.AREA_CODE.H.getValue();
            }
        }

    }

    public void printAll() {
        for (int i = 0; i < this.unionMap.length; i++) {
            for (int j = 0; j < this.unionMap[i].length; j++) {
                System.out.print(this.unionMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
