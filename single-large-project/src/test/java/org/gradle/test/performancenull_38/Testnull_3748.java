package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3748 {
    private final Productionnull_3748 production = new Productionnull_3748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}