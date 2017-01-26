package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30057 {
    private final Productionnull_30057 production = new Productionnull_30057("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}