package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_194 {
    private final Production17_194 production = new Production17_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}