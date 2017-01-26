package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_275 {
    private final Production92_275 production = new Production92_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}