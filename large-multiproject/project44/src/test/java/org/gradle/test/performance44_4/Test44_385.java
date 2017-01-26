package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_385 {
    private final Production44_385 production = new Production44_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}