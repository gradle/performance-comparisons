package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1593 {
    private final Productionnull_1593 production = new Productionnull_1593("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}