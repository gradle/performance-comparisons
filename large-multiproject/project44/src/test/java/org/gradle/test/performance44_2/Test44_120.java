package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_120 {
    private final Production44_120 production = new Production44_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}