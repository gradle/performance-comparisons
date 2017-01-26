package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40143 {
    private final Productionnull_40143 production = new Productionnull_40143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}