package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_153 {
    private final Production79_153 production = new Production79_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}