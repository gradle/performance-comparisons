package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37189 {
    private final Productionnull_37189 production = new Productionnull_37189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}