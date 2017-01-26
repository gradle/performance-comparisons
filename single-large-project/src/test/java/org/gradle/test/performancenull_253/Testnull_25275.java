package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25275 {
    private final Productionnull_25275 production = new Productionnull_25275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}