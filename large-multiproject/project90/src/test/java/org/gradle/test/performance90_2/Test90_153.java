package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_153 {
    private final Production90_153 production = new Production90_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}