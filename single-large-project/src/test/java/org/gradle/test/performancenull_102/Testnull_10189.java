package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10189 {
    private final Productionnull_10189 production = new Productionnull_10189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}