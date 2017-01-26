package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27965 {
    private final Productionnull_27965 production = new Productionnull_27965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}