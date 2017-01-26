package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49741 {
    private final Productionnull_49741 production = new Productionnull_49741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}