package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_113 {
    private final Production92_113 production = new Production92_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}