package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_473 {
    private final Production92_473 production = new Production92_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}