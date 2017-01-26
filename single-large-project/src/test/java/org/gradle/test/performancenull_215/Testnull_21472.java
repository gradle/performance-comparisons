package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21472 {
    private final Productionnull_21472 production = new Productionnull_21472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}