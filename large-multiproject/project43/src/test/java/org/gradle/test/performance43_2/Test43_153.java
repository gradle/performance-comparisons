package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_153 {
    private final Production43_153 production = new Production43_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}