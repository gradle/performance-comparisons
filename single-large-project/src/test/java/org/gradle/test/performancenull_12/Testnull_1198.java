package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1198 {
    private final Productionnull_1198 production = new Productionnull_1198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}