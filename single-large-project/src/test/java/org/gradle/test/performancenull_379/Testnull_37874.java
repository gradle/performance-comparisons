package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37874 {
    private final Productionnull_37874 production = new Productionnull_37874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}