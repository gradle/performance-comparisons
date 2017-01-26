package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_342 {
    private final Production50_342 production = new Production50_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}