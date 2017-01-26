package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6181 {
    private final Productionnull_6181 production = new Productionnull_6181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}