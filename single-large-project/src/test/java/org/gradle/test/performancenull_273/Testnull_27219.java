package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27219 {
    private final Productionnull_27219 production = new Productionnull_27219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}