package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27961 {
    private final Productionnull_27961 production = new Productionnull_27961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}