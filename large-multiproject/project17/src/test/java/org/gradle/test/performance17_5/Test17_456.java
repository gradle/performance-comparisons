package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_456 {
    private final Production17_456 production = new Production17_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}