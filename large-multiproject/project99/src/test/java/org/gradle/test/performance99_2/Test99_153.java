package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_153 {
    private final Production99_153 production = new Production99_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}