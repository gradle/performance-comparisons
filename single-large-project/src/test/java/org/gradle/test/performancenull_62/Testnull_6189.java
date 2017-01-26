package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6189 {
    private final Productionnull_6189 production = new Productionnull_6189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}