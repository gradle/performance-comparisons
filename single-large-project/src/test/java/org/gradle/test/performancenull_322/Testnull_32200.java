package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32200 {
    private final Productionnull_32200 production = new Productionnull_32200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}