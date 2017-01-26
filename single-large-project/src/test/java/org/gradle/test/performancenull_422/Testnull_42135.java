package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42135 {
    private final Productionnull_42135 production = new Productionnull_42135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}