package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27462 {
    private final Productionnull_27462 production = new Productionnull_27462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}