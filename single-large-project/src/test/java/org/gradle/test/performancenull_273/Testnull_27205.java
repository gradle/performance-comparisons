package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27205 {
    private final Productionnull_27205 production = new Productionnull_27205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}