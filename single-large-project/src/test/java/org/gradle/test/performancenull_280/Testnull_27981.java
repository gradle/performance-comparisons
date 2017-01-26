package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27981 {
    private final Productionnull_27981 production = new Productionnull_27981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}