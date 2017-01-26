package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25267 {
    private final Productionnull_25267 production = new Productionnull_25267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}