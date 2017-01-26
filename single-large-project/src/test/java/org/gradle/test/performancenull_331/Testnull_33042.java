package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33042 {
    private final Productionnull_33042 production = new Productionnull_33042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}