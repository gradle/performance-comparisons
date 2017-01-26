package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27983 {
    private final Productionnull_27983 production = new Productionnull_27983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}