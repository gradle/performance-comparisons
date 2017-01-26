package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25809 {
    private final Productionnull_25809 production = new Productionnull_25809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}