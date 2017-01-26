package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_368 {
    private final Production44_368 production = new Production44_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}