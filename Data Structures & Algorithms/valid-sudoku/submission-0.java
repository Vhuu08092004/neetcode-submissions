class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] boxs = new HashSet[9];

         for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                
                char v = board[r][c]; 

                if ( v == '.') continue;

                int b = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(v)
                        || cols[c].contains(v)
                        || boxs[b].contains(v)) {
                    return false;
                }

                rows[r].add(v);
                cols[c].add(v);
                boxs[b].add(v);
            }
        }
        return true;
    }
}
