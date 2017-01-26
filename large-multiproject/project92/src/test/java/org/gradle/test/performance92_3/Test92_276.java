package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_276 {
    private final Production92_276 production = new Production92_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}