package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3868 {
    private final Productionnull_3868 production = new Productionnull_3868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}