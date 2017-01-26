package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_264 {
    private final Production92_264 production = new Production92_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}