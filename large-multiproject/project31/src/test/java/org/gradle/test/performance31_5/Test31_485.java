package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_485 {
    private final Production31_485 production = new Production31_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}