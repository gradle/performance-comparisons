package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25087 {
    private final Productionnull_25087 production = new Productionnull_25087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}