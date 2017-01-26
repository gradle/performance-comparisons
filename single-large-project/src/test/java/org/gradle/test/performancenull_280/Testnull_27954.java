package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27954 {
    private final Productionnull_27954 production = new Productionnull_27954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}