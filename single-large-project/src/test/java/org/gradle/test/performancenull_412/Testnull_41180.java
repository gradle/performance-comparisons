package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41180 {
    private final Productionnull_41180 production = new Productionnull_41180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}