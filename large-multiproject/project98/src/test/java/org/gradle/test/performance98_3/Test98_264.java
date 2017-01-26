package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_264 {
    private final Production98_264 production = new Production98_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}