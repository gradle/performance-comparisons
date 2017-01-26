package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_159 {
    private final Production17_159 production = new Production17_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}