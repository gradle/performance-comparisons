package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4189 {
    private final Productionnull_4189 production = new Productionnull_4189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}