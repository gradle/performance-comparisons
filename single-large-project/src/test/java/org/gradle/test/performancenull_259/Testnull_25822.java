package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25822 {
    private final Productionnull_25822 production = new Productionnull_25822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}