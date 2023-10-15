function reverse(str, subStr){
    return str.split(subStr).reverse().join(subStr);
}

let str = "This is a sunny day";

let str1 = reverse(str, "")

let str2 = reverse(str1, " ")

console.log(str2)