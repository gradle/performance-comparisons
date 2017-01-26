package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40265 {
    private final Productionnull_40265 production = new Productionnull_40265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}