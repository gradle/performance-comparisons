package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_153 {
    private final Production20_153 production = new Production20_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}