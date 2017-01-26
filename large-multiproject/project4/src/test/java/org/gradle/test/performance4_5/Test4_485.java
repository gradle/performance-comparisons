package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_485 {
    private final Production4_485 production = new Production4_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}