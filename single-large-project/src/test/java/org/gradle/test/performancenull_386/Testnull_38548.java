package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38548 {
    private final Productionnull_38548 production = new Productionnull_38548("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}