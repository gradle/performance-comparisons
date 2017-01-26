package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42084 {
    private final Productionnull_42084 production = new Productionnull_42084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}