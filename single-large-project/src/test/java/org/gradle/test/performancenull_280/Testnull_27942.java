package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27942 {
    private final Productionnull_27942 production = new Productionnull_27942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}