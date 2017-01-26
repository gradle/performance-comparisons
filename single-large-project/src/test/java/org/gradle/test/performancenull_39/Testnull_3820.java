package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3820 {
    private final Productionnull_3820 production = new Productionnull_3820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}