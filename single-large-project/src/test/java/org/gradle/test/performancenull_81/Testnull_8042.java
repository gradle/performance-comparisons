package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8042 {
    private final Productionnull_8042 production = new Productionnull_8042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}