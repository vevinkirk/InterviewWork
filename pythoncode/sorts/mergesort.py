def mergesort(arr):
    length = len(arr)
    if(length>1):
        mid = length//2
        leftHalf = arr[:mid]
        rightHalf = arr[mid:]

        mergesort(leftHalf)
        mergesort(rightHalf)

        leftHalfCounter = 0
        rightHalfCounter = 0
        arrCounter = 0

        while(leftHalfCounter < len(leftHalf) and rightHalfCounter < len(rightHalf)):
            if(leftHalf[leftHalfCounter] <= rightHalf[rightHalfCounter]):
                arr[arrCounter] = leftHalf[leftHalfCounter]
                leftHalfCounter+=1
            else:
                arr[arrCounter] = rightHalf[rightHalfCounter]
                rightHalfCounter+=1
            arrCounter+=1

        while(leftHalfCounter < len(leftHalf)):
            arr[arrCounter] = leftHalf[leftHalfCounter]
            leftHalfCounter +=1
            arrCounter += 1
        while(rightHalfCounter < len(rightHalf)):
            arr[arrCounter] = rightHalf[rightHalfCounter]
            rightHalfCounter +=1
            arrCounter +=1

alist = [54,26,93,17,77,31,44,55,20]
mergesort(alist)
print(alist)
