package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25980 {
    private final Productionnull_25980 production = new Productionnull_25980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}