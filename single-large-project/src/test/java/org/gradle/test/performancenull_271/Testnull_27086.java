package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27086 {
    private final Productionnull_27086 production = new Productionnull_27086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}