package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18726 {
    private final Productionnull_18726 production = new Productionnull_18726("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}