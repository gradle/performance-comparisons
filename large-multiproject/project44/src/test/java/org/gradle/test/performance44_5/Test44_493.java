package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_493 {
    private final Production44_493 production = new Production44_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}