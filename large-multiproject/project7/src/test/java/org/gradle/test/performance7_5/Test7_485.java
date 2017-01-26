package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_485 {
    private final Production7_485 production = new Production7_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}