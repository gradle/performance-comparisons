package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_153 {
    private final Production77_153 production = new Production77_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}