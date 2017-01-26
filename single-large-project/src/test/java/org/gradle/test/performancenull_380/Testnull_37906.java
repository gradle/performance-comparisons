package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37906 {
    private final Productionnull_37906 production = new Productionnull_37906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}