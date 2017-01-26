package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_180 {
    private final Production92_180 production = new Production92_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}