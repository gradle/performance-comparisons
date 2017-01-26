package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27929 {
    private final Productionnull_27929 production = new Productionnull_27929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}