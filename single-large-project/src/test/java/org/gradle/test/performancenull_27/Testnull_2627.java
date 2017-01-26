package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2627 {
    private final Productionnull_2627 production = new Productionnull_2627("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}