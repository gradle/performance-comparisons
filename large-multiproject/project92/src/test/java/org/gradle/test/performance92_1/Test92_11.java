package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_11 {
    private final Production92_11 production = new Production92_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}