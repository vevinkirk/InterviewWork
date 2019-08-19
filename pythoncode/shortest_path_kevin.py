maze = [[0,1,0,0,0],[0,0,0,1,0],[1,1,1,1,0]] #Answer 7

def shortest_path(x,y,maze):
    totalBoard = len(maze)
    innerArrays = len(maze[0])
    canTravel = [[None for i in range(innerArrays)] for i in range(totalBoard)]
    for j in range(totalBoard):
        for k in range(innerArrays):
            if maze[j][k] == 1:
                canTravel[j][k] = 1
    return canTravel[j][k]

def solution(maze):
    ans = shortest_path(0,0,maze)
