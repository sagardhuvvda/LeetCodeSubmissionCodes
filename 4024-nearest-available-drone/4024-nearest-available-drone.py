class Solution:
    def nearestDrone(self, drones: list[list[int]], target: list[int]) -> int:
        c = -1
        nl = []
        for i in drones:
            a = (abs(i[0] - target[0])) + (abs(i[1] - target[1]))
            nl.append(a)
        m = 101
        if len(nl) == 1 and nl[0] > drones[0][2]:
            return -1
        for i in range(0 , len(nl)):
            if nl[i] < m and drones[i][2] >= nl[i]:
                m = nl[i]
                c = i
        return c