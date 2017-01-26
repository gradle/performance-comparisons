package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8443 {
    private final Productionnull_8443 production = new Productionnull_8443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}