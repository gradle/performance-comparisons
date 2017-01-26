package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35931 {
    private final Productionnull_35931 production = new Productionnull_35931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}