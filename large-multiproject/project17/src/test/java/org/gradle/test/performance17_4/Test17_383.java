package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_383 {
    private final Production17_383 production = new Production17_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}