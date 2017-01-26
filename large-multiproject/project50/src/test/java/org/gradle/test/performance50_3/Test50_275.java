package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_275 {
    private final Production50_275 production = new Production50_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}