package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4085 {
    private final Productionnull_4085 production = new Productionnull_4085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}