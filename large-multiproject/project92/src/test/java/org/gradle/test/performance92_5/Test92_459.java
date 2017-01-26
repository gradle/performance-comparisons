package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_459 {
    private final Production92_459 production = new Production92_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}