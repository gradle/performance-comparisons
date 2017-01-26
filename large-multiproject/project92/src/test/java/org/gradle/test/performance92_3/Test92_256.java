package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_256 {
    private final Production92_256 production = new Production92_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}