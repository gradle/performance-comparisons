package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_433 {
    private final Production17_433 production = new Production17_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}