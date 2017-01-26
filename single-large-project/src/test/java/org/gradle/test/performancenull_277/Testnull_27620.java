package org.gradle.test.performancenull_277;

import static org.junit.Assert.*;

public class Testnull_27620 {
    private final Productionnull_27620 production = new Productionnull_27620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}