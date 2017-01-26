package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27978 {
    private final Productionnull_27978 production = new Productionnull_27978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}