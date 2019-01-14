_X__
_X__
XOOO
XOOO

[[0, 1, 1, 0],
 [0, 1, 0, 0],
 [1, 1, 1, 2],
 [1, 1, 0, 2]]

def update(board):
    markerArray = []

    totalBoard = len(board)
    innerArrays = len(board[0])
    for x in range(totalBoard):
        for j in range(innerArrays):
            if board[x][j] >= 1:
                counter = board[x][j]
            if board[x][j+1] = counter && board[x+1][j] &&   board[x+1][j+1]:
                markerArray.append((x,j))
                markerArray.append((x,j+1))
                markerArray.append((x+1,j))
                markerArray.append((x+1,j+1))

    for k in range(len(markerArray)):
        x = markerArray[k]
        xCoord = x[0]
        yCoord = x[1]
        board[xCoord][yCoord] = 0
        while(xCoord != 0):
            board[xCoord][yCoord] = board[xCoord-1][yCoord]
            board[xCoord-1][yCoord] = 0
            xCoord = xCoord - 1
            board[0][yCoord] = 0
    if len(markerArray) =  0:
        exit
    update(board)
