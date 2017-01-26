package org.gradle.test.performancenull_29;

import static org.junit.Assert.*;

public class Testnull_2868 {
    private final Productionnull_2868 production = new Productionnull_2868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}