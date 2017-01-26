package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7189 {
    private final Productionnull_7189 production = new Productionnull_7189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}