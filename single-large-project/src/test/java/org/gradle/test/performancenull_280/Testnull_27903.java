package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27903 {
    private final Productionnull_27903 production = new Productionnull_27903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}