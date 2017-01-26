package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_355 {
    private final Production44_355 production = new Production44_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}