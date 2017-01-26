package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8009 {
    private final Productionnull_8009 production = new Productionnull_8009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}