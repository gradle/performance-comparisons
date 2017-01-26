package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_120 {
    private final Production92_120 production = new Production92_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}