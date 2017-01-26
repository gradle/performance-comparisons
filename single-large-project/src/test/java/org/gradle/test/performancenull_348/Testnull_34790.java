package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34790 {
    private final Productionnull_34790 production = new Productionnull_34790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}