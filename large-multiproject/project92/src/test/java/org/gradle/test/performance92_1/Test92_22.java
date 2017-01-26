package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_22 {
    private final Production92_22 production = new Production92_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}