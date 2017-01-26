package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10055 {
    private final Productionnull_10055 production = new Productionnull_10055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}