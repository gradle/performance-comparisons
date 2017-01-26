package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16877 {
    private final Productionnull_16877 production = new Productionnull_16877("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}