package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_485 {
    private final Production89_485 production = new Production89_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}