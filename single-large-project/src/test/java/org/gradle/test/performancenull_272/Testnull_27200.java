package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27200 {
    private final Productionnull_27200 production = new Productionnull_27200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}