package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_11 {
    private final Production44_11 production = new Production44_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}