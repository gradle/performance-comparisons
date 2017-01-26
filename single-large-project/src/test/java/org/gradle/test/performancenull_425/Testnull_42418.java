package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42418 {
    private final Productionnull_42418 production = new Productionnull_42418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}