package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37126 {
    private final Productionnull_37126 production = new Productionnull_37126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}