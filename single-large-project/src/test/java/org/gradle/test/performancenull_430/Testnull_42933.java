package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42933 {
    private final Productionnull_42933 production = new Productionnull_42933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}