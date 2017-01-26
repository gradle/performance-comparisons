package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_485 {
    private final Production84_485 production = new Production84_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}