package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_319 {
    private final Production50_319 production = new Production50_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}