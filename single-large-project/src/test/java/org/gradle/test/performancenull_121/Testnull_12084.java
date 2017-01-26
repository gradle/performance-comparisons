package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12084 {
    private final Productionnull_12084 production = new Productionnull_12084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}