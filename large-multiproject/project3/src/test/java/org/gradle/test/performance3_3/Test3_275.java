package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_275 {
    private final Production3_275 production = new Production3_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}