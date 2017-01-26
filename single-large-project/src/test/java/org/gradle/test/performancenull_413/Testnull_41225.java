package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41225 {
    private final Productionnull_41225 production = new Productionnull_41225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}