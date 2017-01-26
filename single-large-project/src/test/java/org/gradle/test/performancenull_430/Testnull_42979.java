package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42979 {
    private final Productionnull_42979 production = new Productionnull_42979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}