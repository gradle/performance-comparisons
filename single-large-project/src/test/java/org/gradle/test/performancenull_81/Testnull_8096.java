package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8096 {
    private final Productionnull_8096 production = new Productionnull_8096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}