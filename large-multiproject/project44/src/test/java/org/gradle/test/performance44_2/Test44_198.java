package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_198 {
    private final Production44_198 production = new Production44_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}