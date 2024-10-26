package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution6Test {

    private final Solution6 solution = new Solution6();

    @Test
    void testPeopleIndexes_EdgeCases() {
        // 测试边界情况

        // 测试只有一个用户的情况
        List<List<String>> favoriteCompaniesSingle = Arrays.asList(
                Arrays.asList("google")
        );
        assertEquals(Arrays.asList(0), solution.peopleIndexes(favoriteCompaniesSingle));

        // 测试所有用户收藏的公司完全相同的情况
        List<List<String>> favoriteCompaniesSame = Arrays.asList(
                Arrays.asList("google", "facebook"),
                Arrays.asList("google", "facebook"),
                Arrays.asList("google", "facebook")
        );
        assertEquals(Arrays.asList(), solution.peopleIndexes(favoriteCompaniesSame));

        // 测试所有用户收藏的公司都不相同
        List<List<String>> favoriteCompaniesUnique = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"),
                Arrays.asList("c")
        );
        assertEquals(Arrays.asList(0, 1, 2), solution.peopleIndexes(favoriteCompaniesUnique));

        // 测试大规模输入
        List<List<String>> favoriteCompaniesLarge = Arrays.asList(
                Arrays.asList("a1", "a2"),
                Arrays.asList("b1", "b2"),
                Arrays.asList("c1", "c2", "a1"),
                Arrays.asList("d1"),
                Arrays.asList("e1", "e2", "f1", "f2", "a2")
        );
        assertEquals(Arrays.asList(0, 1, 2, 3, 4), solution.peopleIndexes(favoriteCompaniesLarge)); // Fixed the expected output here
    }
}
