package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_339 {
    private final Production92_339 production = new Production92_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}