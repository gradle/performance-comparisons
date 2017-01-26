package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42152 {
    private final Productionnull_42152 production = new Productionnull_42152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}