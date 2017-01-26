package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_440 {
    private final Production92_440 production = new Production92_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}