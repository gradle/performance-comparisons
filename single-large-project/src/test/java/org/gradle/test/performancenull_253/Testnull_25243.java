package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25243 {
    private final Productionnull_25243 production = new Productionnull_25243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}