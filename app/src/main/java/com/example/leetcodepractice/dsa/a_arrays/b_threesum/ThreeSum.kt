package com.example.leetcodepractice.dsa.a_arrays.b_threesum

fun main() {

    println(threeSumUsing2Pointers())
}

//Using 2 pointers with sorted inputList
fun threeSumUsing2Pointers() : List<List<Int>> {

    val inputArray = arrayListOf<Int>(-8, -6, 1, 2, 3, 5, 6, 12)
    //val inputArray = arrayListOf<Int>(12, 3, 1, 2, -6, 5, -8, 6)
    inputArray.sort() //QuickSort takes time O(nLogn) and space O(1)
    val targetSum = 0 // [-6, 1, 5]

    val output2dArray = ArrayList<ArrayList<Int>>()

    for (index in 0..inputArray.size - 2) {
        var startingIndex = index
        var leftPointer = startingIndex + 1
        var rightPointer = inputArray.lastIndex

        while (leftPointer < rightPointer) {
            val potentialSum = inputArray[startingIndex] + inputArray[leftPointer] + inputArray[rightPointer]
            if (potentialSum == targetSum) {
                println("${inputArray[startingIndex]}  ${inputArray[leftPointer]} ${inputArray[rightPointer]}")
                output2dArray.add(arrayListOf(inputArray[startingIndex], inputArray[leftPointer], inputArray[rightPointer]))
                rightPointer--
                leftPointer++
            } else if (potentialSum > targetSum) {
                rightPointer--
            } else {
                leftPointer++
            }
        }
    }

    return output2dArray
}

fun threeSumUsingHashMap() {
    //same as 2sum
}

// returns true if there is triplet with sum equal to 'sum' present in A[]. Also, prints the triplet
/* boolean threeSumUsingHashMap(int A[], int arr_size, int sum)
{
    // Fix the first element as A[i]
    for (int i = 0; i < arr_size - 2; i++) {

    // Find pair in subarray A[i+1..n-1]
    // with sum equal to sum - A[i]
    HashSet<Integer> s = new HashSet<Integer>();
    int curr_sum = sum - A[i];
    for (int j = i + 1; j < arr_size; j++)
    {
        if (s.contains(curr_sum - A[j]))
        {
            System.out.printf("Triplet is %d,
                    %d, %d", A[i],
            A[j], curr_sum - A[j]);
            return true;
        }
        s.add(A[j]);
    }
}

    // If we reach here, then no triplet was found
    return false;
}*/