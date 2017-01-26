package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25886 {
    private final Productionnull_25886 production = new Productionnull_25886("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}