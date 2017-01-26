package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_248 {
    private final Production50_248 production = new Production50_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}