package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41401 {
    private final Productionnull_41401 production = new Productionnull_41401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}