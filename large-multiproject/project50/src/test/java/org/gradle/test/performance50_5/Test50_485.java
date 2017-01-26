package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_485 {
    private final Production50_485 production = new Production50_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}