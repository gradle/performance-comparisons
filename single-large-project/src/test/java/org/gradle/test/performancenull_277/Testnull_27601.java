package org.gradle.test.performancenull_277;

import static org.junit.Assert.*;

public class Testnull_27601 {
    private final Productionnull_27601 production = new Productionnull_27601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}