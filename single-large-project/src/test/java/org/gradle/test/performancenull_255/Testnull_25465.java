package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25465 {
    private final Productionnull_25465 production = new Productionnull_25465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}