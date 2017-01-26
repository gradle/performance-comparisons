package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2189 {
    private final Productionnull_2189 production = new Productionnull_2189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}