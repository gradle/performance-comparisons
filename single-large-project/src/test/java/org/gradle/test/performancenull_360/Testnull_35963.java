package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35963 {
    private final Productionnull_35963 production = new Productionnull_35963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}