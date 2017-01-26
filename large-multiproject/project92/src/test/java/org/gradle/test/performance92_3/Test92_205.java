package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_205 {
    private final Production92_205 production = new Production92_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}