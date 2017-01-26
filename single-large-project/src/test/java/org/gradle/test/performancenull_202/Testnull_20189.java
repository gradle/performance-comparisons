package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20189 {
    private final Productionnull_20189 production = new Productionnull_20189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}