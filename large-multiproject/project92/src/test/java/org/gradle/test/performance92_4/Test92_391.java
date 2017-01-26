package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_391 {
    private final Production92_391 production = new Production92_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}