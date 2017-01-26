package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20195 {
    private final Productionnull_20195 production = new Productionnull_20195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}