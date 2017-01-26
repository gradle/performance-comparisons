package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_141 {
    private final Production92_141 production = new Production92_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}