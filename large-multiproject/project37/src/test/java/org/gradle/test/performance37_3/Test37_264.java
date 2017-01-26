package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_264 {
    private final Production37_264 production = new Production37_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}