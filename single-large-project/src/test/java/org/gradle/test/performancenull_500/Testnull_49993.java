package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49993 {
    private final Productionnull_49993 production = new Productionnull_49993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}