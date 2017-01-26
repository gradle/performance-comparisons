package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25945 {
    private final Productionnull_25945 production = new Productionnull_25945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}