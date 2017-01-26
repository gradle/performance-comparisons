package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_264 {
    private final Production20_264 production = new Production20_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}