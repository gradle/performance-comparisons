package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37871 {
    private final Productionnull_37871 production = new Productionnull_37871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}