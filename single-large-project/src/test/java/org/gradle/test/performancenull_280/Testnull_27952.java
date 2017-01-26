package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27952 {
    private final Productionnull_27952 production = new Productionnull_27952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}