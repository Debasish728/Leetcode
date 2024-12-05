/**
 * @param {string} s
 * @param {string[]} words
 * @return {number[]}
 */
var findSubstring = function(s, words) {
    let map = {}
    let current = {}
    for(let word of words){
        map[word] = (map[word]||0)+1;

    }
    const len = s.length;
    const n = words.length;
    const wordSize = words[0].length;
    const windowSize = wordSize*n;
    const ans = [];
    for(let startPos = 0; startPos<wordSize; startPos++){
        let start = startPos;
        do{
            Object.assign(current,map);
            let matched = true;
            for(let i=0;i<n;i++){
                const currWord = s.substring(
                    start+i*wordSize,
                    start+(i+1)*wordSize

                );
                if(!current[currWord] || current[currWord] === 0){
                    matched = false;
                    break;
                }
                current[currWord]--;
            }
            if(matched){
                ans.push(start);
            }

            start+=wordSize;
        } while(start+windowSize-1<len);
        
    }
    return ans;
    
};