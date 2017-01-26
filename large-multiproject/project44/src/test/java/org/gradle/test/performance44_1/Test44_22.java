package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_22 {
    private final Production44_22 production = new Production44_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}