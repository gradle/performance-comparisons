package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30027 {
    private final Productionnull_30027 production = new Productionnull_30027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}