package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2742 {
    private final Productionnull_2742 production = new Productionnull_2742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}