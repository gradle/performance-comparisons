package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34066 {
    private final Productionnull_34066 production = new Productionnull_34066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}