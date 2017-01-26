package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34973 {
    private final Productionnull_34973 production = new Productionnull_34973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}