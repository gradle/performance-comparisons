package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25524 {
    private final Productionnull_25524 production = new Productionnull_25524("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}