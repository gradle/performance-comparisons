package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_485 {
    private final Production20_485 production = new Production20_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}