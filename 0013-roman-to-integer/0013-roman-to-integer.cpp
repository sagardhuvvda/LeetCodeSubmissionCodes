class Solution {
public:
    int romanToInt(string s) {
    // Step 1: Map each Roman symbol to its integer value
    unordered_map<char, int> value = {
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}
    };
    
    int total = 0;

    // Step 2: Traverse the string
    for (int i = 0; i < s.size(); i++) {
        // Step 3: Check subtraction rule
        if (i + 1 < s.size() && value[s[i]] < value[s[i + 1]]) {
            total -= value[s[i]];  // Subtract if smaller than next
        } else {
            total += value[s[i]];  // Otherwise, add it
        }
    }

    return total; // Step 4: Return total value
}

};