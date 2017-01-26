package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24005 {
    private final Productionnull_24005 production = new Productionnull_24005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}