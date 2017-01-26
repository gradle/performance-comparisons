package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25861 {
    private final Productionnull_25861 production = new Productionnull_25861("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}