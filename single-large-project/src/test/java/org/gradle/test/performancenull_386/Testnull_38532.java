package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38532 {
    private final Productionnull_38532 production = new Productionnull_38532("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}