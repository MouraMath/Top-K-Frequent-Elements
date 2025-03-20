English || Português


Problem
Given an integer array nums and an integer k, find the k most frequent elements in the array. The result can be returned in any order.

Examples
Example 1:

text
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

text
Input: nums = [1], k = 1
Output: [1]
Solution
Count the frequency of each number using a HashMap.

Use bucket sort to group numbers by their frequency.

Collect the k most frequent numbers starting from the highest frequency bucket.

-------------------------------------------------------------------------------------

Problema
Dado um array de inteiros nums e um inteiro k, encontre os k elementos mais frequentes no array. O resultado pode ser retornado em qualquer ordem.

Exemplos
Exemplo 1:

text
Entrada: nums = [1,1,1,2,2,3], k = 2
Saída: [1,2]
Exemplo 2:

text
Entrada: nums = [1], k = 1
Saída: [1]
Solução
Conte a frequência de cada número usando um HashMap.

Use o algoritmo de bucket sort para agrupar os números por frequência.

Colete os k números mais frequentes começando pelo bucket de maior frequência.
