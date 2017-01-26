package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27956 {
    private final Productionnull_27956 production = new Productionnull_27956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}