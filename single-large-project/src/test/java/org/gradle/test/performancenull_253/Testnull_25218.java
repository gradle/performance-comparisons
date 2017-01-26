package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25218 {
    private final Productionnull_25218 production = new Productionnull_25218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}