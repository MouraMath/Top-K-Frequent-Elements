Top K Frequent Elements --- English || Português


English

Problem
Given an integer array nums and an integer k, the goal is to return the k most frequent elements from the array. The result can be returned in any order.

Solution
This solution uses a bucket sort approach:

Frequency Map: Count the frequency of each number in the array using a dictionary (or hash map).

Buckets: Create an array of lists (buckets) where the index represents the frequency. For example, if a number appears 3 times, it will be placed in buckets.

Collect Results: Iterate through the buckets in reverse order (from high frequency to low) and collect numbers until we have k elements.

Advantages of This Approach
Efficiency: The algorithm runs in O(n) time complexity, which is better than sorting-based solutions (O(n log n)).

Simplicity: The bucket sort method is intuitive and avoids unnecessary computations.

Scalability: Works well with large datasets due to its linear time complexity.

--------------------------------------------------------------------------------------

Português


Problema
Dado um array de inteiros nums e um inteiro k, o objetivo é retornar os k elementos mais frequentes do array. O resultado pode ser retornado em qualquer ordem.

Solução
Esta solução utiliza a abordagem de bucket sort:

Mapa de Frequência: Conta a frequência de cada número no array usando um dicionário (ou hash map).

Buckets: Cria um array de listas (buckets) onde o índice representa a frequência. Por exemplo, se um número aparece 3 vezes, ele será colocado em buckets.

Coleta de Resultados: Itera pelos buckets em ordem reversa (da maior frequência para a menor) e coleta números até termos k elementos.

Vantagens Desta Abordagem
Eficiência: O algoritmo tem complexidade de tempo O(n), que é melhor do que soluções baseadas em ordenação (O(n log n)).

Simplicidade: O método de bucket sort é intuitivo e evita cálculos desnecessários.

Escalabilidade: Funciona bem com grandes conjuntos de dados devido à sua complexidade linear.
