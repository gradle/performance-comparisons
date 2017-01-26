package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12005 {
    private final Productionnull_12005 production = new Productionnull_12005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}