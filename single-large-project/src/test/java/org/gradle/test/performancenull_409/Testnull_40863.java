package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40863 {
    private final Productionnull_40863 production = new Productionnull_40863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}