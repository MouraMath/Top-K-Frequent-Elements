package org.example;

import java.util.*;

/**
 * Solução para o problema "Top K Frequent Elements" do LeetCode
 *
 * Problema: Dado um array de inteiros e um número k, retorne os k elementos
 * mais frequentes no array. Você pode retornar a resposta em qualquer ordem.
 *
 * Abordagem: Bucket Sort
 * Complexidade de Tempo: O(n) onde n é o tamanho do array
 * Complexidade de Espaço: O(n)
 */
public class TopKFrequentElements {

    /**
     * Encontra os k elementos mais frequentes no array
     *
     * @param nums array de inteiros
     * @param k número de elementos frequentes a retornar
     * @return array com os k elementos mais frequentes
     */
    public int[] topKFrequent(int[] nums, int k) {
        // Passo 1: Criar um mapa para contar a frequência de cada número
        // A chave é o número e o valor é quantas vezes ele aparece
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            // Incrementa a contagem para este número
            // getOrDefault retorna o valor atual ou 0 se não existir
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            // ou frequencyMap.merge(num, 1, Integer::sum);
        }

        // Passo 2: Criar um array de listas onde o índice é a frequência
        // Por exemplo, buckets[3] contém todos os números que aparecem 3 vezes
        // O tamanho máximo possível é o tamanho do array nums (se todos elementos forem iguais)
        List<Integer>[] buckets = new List[nums.length + 1];

        // Inicializar cada bucket como uma lista vazia
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Passo 3: Distribuir os números nos buckets de acordo com sua frequência
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();      // O número
            int frequency = entry.getValue(); // Quantas vezes aparece
            buckets[frequency].add(number);
        }

        // Passo 4: Coletar os k elementos mais frequentes
        List<Integer> result = new ArrayList<>();

        // Percorrer os buckets de trás para frente (da maior frequência para a menor)
        for (int freq = nums.length; freq > 0; freq--) {
            // Para cada bucket, adicionar todos os números à lista de resultados
            for (int num : buckets[freq]) {
                result.add(num);
                // Se já temos k elementos, convertemos a lista para array e retornamos
                if (result.size() == k) {
                    return listToArray(result);
                }
            }
        }

        // Se não atingimos k elementos
        return listToArray(result);
    }

    /**
     * Método auxiliar para converter List<Integer> para int[]
     */
    private int[] listToArray(List<Integer> list) {
        // Usa Stream API para converter a lista para array
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Método principal para testar a solução
     */
    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();

        // Teste 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] result1 = solution.topKFrequent(nums1, k1);
        System.out.println("Teste 1: " + Arrays.toString(result1));

        // Teste 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = solution.topKFrequent(nums2, k2);
        System.out.println("Teste 2: " + Arrays.toString(result2));
    }
}
