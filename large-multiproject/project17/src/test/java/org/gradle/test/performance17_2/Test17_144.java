package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_144 {
    private final Production17_144 production = new Production17_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}