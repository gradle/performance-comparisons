package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_153 {
    private final Production7_153 production = new Production7_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}