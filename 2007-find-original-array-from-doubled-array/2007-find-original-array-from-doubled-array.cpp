class Solution {
public:
    vector<int> findOriginalArray(vector<int>& c) {
        int n = c.size();
        if(n%2!=0)return {};
        unordered_map<int,int>frq;
        for(auto i:c){
            frq[i]++;
        }
        sort(c.begin(),c.end());
        vector<int>ans;
        //1 2 3 4 6 8 
        //[{1:1},{2:1},{3:1},{4:1},{6:1},{8:1}]
        for(auto i:c){
            if(frq[i]==0)continue;
            if(frq[i*2]==0)return{};
            ans.push_back(i);
            frq[i]--;
            frq[2*i]--;
        }
        return ans;
    }
};