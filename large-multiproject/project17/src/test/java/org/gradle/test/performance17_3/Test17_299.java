package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_299 {
    private final Production17_299 production = new Production17_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}