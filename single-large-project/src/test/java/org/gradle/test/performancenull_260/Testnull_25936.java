package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25936 {
    private final Productionnull_25936 production = new Productionnull_25936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}