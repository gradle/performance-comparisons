package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_485 {
    private final Production16_485 production = new Production16_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}