package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42104 {
    private final Productionnull_42104 production = new Productionnull_42104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}