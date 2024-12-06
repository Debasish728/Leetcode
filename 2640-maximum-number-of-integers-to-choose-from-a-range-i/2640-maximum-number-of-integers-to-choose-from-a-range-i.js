/**
 * @param {number[]} banned
 * @param {number} n
 * @param {number} maxSum
 * @return {number}
 */
var maxCount = function(banned, n, maxSum) {
    let currentSum = 0;
    let count = 0;
    for(let i=1;i<=n;i++){
        currentSum += i;
        if(banned.includes(i) || currentSum>maxSum){
            currentSum -= i;
            
        }else{
            count++;
        }
    }
    return count;
    
};