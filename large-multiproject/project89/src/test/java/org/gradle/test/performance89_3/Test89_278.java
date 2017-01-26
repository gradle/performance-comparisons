package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_278 {
    private final Production89_278 production = new Production89_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}