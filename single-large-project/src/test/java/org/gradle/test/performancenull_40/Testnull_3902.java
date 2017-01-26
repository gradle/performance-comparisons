package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3902 {
    private final Productionnull_3902 production = new Productionnull_3902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}