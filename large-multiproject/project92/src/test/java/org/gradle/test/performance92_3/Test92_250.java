package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_250 {
    private final Production92_250 production = new Production92_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}