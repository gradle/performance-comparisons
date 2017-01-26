package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27450 {
    private final Productionnull_27450 production = new Productionnull_27450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}