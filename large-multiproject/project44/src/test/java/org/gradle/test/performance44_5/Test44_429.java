package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_429 {
    private final Production44_429 production = new Production44_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}