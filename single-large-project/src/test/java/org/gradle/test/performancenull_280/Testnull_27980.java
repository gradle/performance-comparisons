package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27980 {
    private final Productionnull_27980 production = new Productionnull_27980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}