package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38502 {
    private final Productionnull_38502 production = new Productionnull_38502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}