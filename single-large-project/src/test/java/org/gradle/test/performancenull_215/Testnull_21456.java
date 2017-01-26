package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21456 {
    private final Productionnull_21456 production = new Productionnull_21456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}