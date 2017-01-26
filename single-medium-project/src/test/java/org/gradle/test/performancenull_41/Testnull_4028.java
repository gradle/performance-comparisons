package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4028 {
    private final Productionnull_4028 production = new Productionnull_4028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}