package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_400 {
    private final Production92_400 production = new Production92_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}