package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30060 {
    private final Productionnull_30060 production = new Productionnull_30060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}