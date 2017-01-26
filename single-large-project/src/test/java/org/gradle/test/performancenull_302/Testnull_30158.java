package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30158 {
    private final Productionnull_30158 production = new Productionnull_30158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}