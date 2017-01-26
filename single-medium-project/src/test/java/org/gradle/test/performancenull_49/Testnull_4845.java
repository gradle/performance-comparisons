package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4845 {
    private final Productionnull_4845 production = new Productionnull_4845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}