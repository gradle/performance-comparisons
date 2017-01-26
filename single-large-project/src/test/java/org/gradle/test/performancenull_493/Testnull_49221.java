package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49221 {
    private final Productionnull_49221 production = new Productionnull_49221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}