package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27906 {
    private final Productionnull_27906 production = new Productionnull_27906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}