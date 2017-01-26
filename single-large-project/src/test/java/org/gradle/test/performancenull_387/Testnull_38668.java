package org.gradle.test.performancenull_387;

import static org.junit.Assert.*;

public class Testnull_38668 {
    private final Productionnull_38668 production = new Productionnull_38668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}