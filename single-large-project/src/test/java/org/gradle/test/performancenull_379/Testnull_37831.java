package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37831 {
    private final Productionnull_37831 production = new Productionnull_37831("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}