package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_264 {
    private final Production35_264 production = new Production35_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}