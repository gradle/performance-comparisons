package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36353 {
    private final Productionnull_36353 production = new Productionnull_36353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}