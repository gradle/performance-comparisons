package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_448 {
    private final Production44_448 production = new Production44_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}