package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_41 {
    private final Productionnull_41 production = new Productionnull_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}