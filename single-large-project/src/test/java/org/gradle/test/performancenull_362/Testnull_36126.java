package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36126 {
    private final Productionnull_36126 production = new Productionnull_36126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}