package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_264 {
    private final Production89_264 production = new Production89_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}