package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_264 {
    private final Production18_264 production = new Production18_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}