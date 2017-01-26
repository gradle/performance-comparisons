package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_117 {
    private final Production17_117 production = new Production17_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}