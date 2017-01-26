package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20145 {
    private final Productionnull_20145 production = new Productionnull_20145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}