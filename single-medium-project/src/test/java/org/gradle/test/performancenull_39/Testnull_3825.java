package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3825 {
    private final Productionnull_3825 production = new Productionnull_3825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}