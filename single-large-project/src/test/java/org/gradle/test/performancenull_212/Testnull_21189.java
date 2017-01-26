package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21189 {
    private final Productionnull_21189 production = new Productionnull_21189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}