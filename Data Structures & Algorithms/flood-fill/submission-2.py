class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        
        original_color = image[sr][sc]
        directions = [(-1, 0), (0, -1), (0, 1), (1, 0)]
        ROWS, COLS = len(image), len(image[0])
        image2 = image.copy()

        def dfs(r, c):
            nonlocal original_color

            if r == ROWS or c == COLS or r < 0 or c < 0 or image[r][c] != original_color or image[r][c] == color:
                return

            image2[r][c] = -1
            image[r][c] = color

            for i, j in directions:
                dfs(r + i, c + j)

        for i in range(ROWS):
            for c in range(COLS):
                dfs(sr, sc)

        return image
