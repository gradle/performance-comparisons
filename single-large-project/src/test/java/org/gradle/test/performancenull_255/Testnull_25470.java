package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25470 {
    private final Productionnull_25470 production = new Productionnull_25470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}