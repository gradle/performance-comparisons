package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3985 {
    private final Productionnull_3985 production = new Productionnull_3985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}