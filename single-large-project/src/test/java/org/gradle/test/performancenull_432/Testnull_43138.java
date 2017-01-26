package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43138 {
    private final Productionnull_43138 production = new Productionnull_43138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}