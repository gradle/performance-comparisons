package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27448 {
    private final Productionnull_27448 production = new Productionnull_27448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}