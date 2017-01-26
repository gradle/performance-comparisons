package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_455 {
    private final Production92_455 production = new Production92_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}