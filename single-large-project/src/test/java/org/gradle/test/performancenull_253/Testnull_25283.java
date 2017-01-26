package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25283 {
    private final Productionnull_25283 production = new Productionnull_25283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}