package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_485 {
    private final Production92_485 production = new Production92_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}