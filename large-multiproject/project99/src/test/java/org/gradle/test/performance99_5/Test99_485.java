package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_485 {
    private final Production99_485 production = new Production99_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}