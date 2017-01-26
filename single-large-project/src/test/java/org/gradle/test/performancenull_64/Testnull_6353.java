package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6353 {
    private final Productionnull_6353 production = new Productionnull_6353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}