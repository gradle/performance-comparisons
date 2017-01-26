package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_264 {
    private final Production44_264 production = new Production44_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}