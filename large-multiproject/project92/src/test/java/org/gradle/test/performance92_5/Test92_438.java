package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_438 {
    private final Production92_438 production = new Production92_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}