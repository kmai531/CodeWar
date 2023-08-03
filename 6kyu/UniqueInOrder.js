var uniqueInOrder = function(iterable) {
    const newArr = [...iterable].filter((item, index) => {
        return item !== iterable[index + 1];
    })
    return newArr;
}