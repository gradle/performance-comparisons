package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_213 {
    private final Production44_213 production = new Production44_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}