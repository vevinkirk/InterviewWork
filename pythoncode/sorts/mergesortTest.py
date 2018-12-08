def mergeSort(arr):
    if len(arr)>1:
        mid = len(arr)//2
        lefthalf = arr[:mid]
        righthalf = arr[mid:]

        mergeSort(lefthalf)
        mergeSort(righthalf)

        leftHalfCounter=0
        rightHalfCounter=0
        arrCounter=0
        while leftHalfCounter < len(lefthalf) and rightHalfCounter < len(righthalf):
            if lefthalf[leftHalfCounter] < righthalf[rightHalfCounter]:
                arr[arrCounter]=lefthalf[leftHalfCounter]
                leftHalfCounter=leftHalfCounter+1
            else:
                arr[arrCounter]=righthalf[rightHalfCounter]
                rightHalfCounter=rightHalfCounter+1
            arrCounter=arrCounter+1

        while leftHalfCounter < len(lefthalf):
            arr[arrCounter]=lefthalf[leftHalfCounter]
            leftHalfCounter=leftHalfCounter+1
            arrCounter=arrCounter+1

        while rightHalfCounter < len(righthalf):
            arr[arrCounter]=righthalf[rightHalfCounter]
            rightHalfCounter=rightHalfCounter+1
            arrCounter=arrCounter+1

arr = [54,26,93,17,77,31,44,55,20]
mergeSort(arr)
print(arr)
