package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21836 {
    private final Productionnull_21836 production = new Productionnull_21836("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}