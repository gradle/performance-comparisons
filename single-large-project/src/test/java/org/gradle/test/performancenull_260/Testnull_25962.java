package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25962 {
    private final Productionnull_25962 production = new Productionnull_25962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}