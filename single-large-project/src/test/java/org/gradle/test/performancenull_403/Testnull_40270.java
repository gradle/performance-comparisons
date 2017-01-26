package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40270 {
    private final Productionnull_40270 production = new Productionnull_40270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}