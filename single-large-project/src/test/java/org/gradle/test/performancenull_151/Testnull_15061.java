package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15061 {
    private final Productionnull_15061 production = new Productionnull_15061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}