package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42928 {
    private final Productionnull_42928 production = new Productionnull_42928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}