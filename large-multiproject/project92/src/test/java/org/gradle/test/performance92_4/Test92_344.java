package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_344 {
    private final Production92_344 production = new Production92_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}