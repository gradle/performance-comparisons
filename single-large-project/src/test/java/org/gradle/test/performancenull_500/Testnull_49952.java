package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49952 {
    private final Productionnull_49952 production = new Productionnull_49952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}