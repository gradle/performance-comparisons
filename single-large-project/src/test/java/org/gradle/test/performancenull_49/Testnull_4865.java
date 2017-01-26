package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4865 {
    private final Productionnull_4865 production = new Productionnull_4865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}