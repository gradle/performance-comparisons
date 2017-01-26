package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38401 {
    private final Productionnull_38401 production = new Productionnull_38401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}