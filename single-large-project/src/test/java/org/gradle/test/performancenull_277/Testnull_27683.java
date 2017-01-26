package org.gradle.test.performancenull_277;

import static org.junit.Assert.*;

public class Testnull_27683 {
    private final Productionnull_27683 production = new Productionnull_27683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}