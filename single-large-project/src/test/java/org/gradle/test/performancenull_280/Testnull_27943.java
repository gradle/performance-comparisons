package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27943 {
    private final Productionnull_27943 production = new Productionnull_27943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}