package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_278 {
    private final Production92_278 production = new Production92_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}