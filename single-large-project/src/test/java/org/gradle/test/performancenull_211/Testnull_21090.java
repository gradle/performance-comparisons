package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21090 {
    private final Productionnull_21090 production = new Productionnull_21090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}