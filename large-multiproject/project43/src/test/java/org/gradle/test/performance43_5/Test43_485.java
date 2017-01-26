package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_485 {
    private final Production43_485 production = new Production43_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}