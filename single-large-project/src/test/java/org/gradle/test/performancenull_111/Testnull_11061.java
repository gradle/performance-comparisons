package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11061 {
    private final Productionnull_11061 production = new Productionnull_11061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}