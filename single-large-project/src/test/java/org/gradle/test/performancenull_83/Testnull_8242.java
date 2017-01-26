package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8242 {
    private final Productionnull_8242 production = new Productionnull_8242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}