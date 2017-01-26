package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_384 {
    private final Production44_384 production = new Production44_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}