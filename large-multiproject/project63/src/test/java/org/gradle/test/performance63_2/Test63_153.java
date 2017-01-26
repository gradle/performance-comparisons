package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_153 {
    private final Production63_153 production = new Production63_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}