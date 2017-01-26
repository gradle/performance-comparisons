package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_301 {
    private final Production92_301 production = new Production92_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}