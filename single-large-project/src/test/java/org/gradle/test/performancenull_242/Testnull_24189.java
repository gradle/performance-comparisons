package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24189 {
    private final Productionnull_24189 production = new Productionnull_24189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}