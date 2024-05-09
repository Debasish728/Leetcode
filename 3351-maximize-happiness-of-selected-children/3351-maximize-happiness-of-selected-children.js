/**
 * @param {number[]} happiness
 * @param {number} k
 * @return {number}
 */
var maximumHappinessSum = function(happiness, k) {

    happiness.sort((a,b)=>b-a);
    let res=0;
    let j=0;
    for(let i=0;i<k;i++){
        let add = happiness[i]-j;
        if(add>=0){
            res+=add;
        }
        
        j++;
    }
    return res;
};