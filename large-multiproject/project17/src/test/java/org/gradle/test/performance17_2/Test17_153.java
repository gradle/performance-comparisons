package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_153 {
    private final Production17_153 production = new Production17_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}