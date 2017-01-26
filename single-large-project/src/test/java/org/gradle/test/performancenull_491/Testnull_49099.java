package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49099 {
    private final Productionnull_49099 production = new Productionnull_49099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}