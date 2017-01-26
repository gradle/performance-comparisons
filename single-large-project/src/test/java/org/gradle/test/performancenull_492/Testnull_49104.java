package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49104 {
    private final Productionnull_49104 production = new Productionnull_49104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}