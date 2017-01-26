package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49980 {
    private final Productionnull_49980 production = new Productionnull_49980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}