package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_123 {
    private final Production17_123 production = new Production17_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}