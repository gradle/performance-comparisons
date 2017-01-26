package org.gradle.test.performancenull_97;

import static org.junit.Assert.*;

public class Testnull_9606 {
    private final Productionnull_9606 production = new Productionnull_9606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}