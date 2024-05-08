/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function(score) {
   let sortedArray = score.slice().sort((a,b)=>b-a);
   let hashmap = {}
   for(let i=0;i<score.length;i++){
    hashmap[sortedArray[i]] = i+1;
   }
   let result = new Array(score.length)
   for(let i=0;i<score.length;i++){
    if(hashmap[score[i]] == 1){
        result[i] = "Gold Medal"

    }else if(hashmap[score[i]] == 2){
        result[i] = "Silver Medal"
    }else if(hashmap[score[i]] == 3){
        result[i] = "Bronze Medal"

    }else{
        result[i] = hashmap[score[i]].toString();
    }
   }
   return result; 
};