package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19825 {
    private final Productionnull_19825 production = new Productionnull_19825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}