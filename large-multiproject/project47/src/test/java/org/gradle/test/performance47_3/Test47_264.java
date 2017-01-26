package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_264 {
    private final Production47_264 production = new Production47_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}