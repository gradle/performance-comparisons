package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35086 {
    private final Productionnull_35086 production = new Productionnull_35086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}