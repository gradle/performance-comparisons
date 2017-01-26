package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_452 {
    private final Production92_452 production = new Production92_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}