package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40023 {
    private final Productionnull_40023 production = new Productionnull_40023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}