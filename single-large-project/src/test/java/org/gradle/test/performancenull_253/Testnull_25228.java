package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25228 {
    private final Productionnull_25228 production = new Productionnull_25228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}