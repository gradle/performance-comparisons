package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_177 {
    private final Production92_177 production = new Production92_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}