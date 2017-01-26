package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_206 {
    private final Production44_206 production = new Production44_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}