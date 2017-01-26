package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37873 {
    private final Productionnull_37873 production = new Productionnull_37873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}