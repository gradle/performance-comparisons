package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_327 {
    private final Production50_327 production = new Production50_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}