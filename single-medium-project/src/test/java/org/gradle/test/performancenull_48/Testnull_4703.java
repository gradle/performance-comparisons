package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4703 {
    private final Productionnull_4703 production = new Productionnull_4703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}