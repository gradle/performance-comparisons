package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35473 {
    private final Productionnull_35473 production = new Productionnull_35473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}