package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2606 {
    private final Productionnull_2606 production = new Productionnull_2606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}