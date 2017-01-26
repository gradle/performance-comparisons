package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4061 {
    private final Productionnull_4061 production = new Productionnull_4061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}