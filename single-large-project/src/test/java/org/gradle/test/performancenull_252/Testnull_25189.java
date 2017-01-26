package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25189 {
    private final Productionnull_25189 production = new Productionnull_25189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}