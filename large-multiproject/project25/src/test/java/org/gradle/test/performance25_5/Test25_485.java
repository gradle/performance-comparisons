package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_485 {
    private final Production25_485 production = new Production25_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}