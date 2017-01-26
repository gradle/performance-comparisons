package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1723 {
    private final Productionnull_1723 production = new Productionnull_1723("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}