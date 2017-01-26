package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_264 {
    private final Production7_264 production = new Production7_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}