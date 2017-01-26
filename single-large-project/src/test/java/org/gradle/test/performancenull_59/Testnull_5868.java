package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5868 {
    private final Productionnull_5868 production = new Productionnull_5868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}