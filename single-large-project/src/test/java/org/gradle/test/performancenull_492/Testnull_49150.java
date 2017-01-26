package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49150 {
    private final Productionnull_49150 production = new Productionnull_49150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}