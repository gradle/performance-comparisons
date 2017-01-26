package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_273 {
    private final Production44_273 production = new Production44_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}