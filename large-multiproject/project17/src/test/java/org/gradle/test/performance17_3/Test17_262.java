package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_262 {
    private final Production17_262 production = new Production17_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}