package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2353 {
    private final Productionnull_2353 production = new Productionnull_2353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}