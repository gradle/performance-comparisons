package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4309 {
    private final Productionnull_4309 production = new Productionnull_4309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}