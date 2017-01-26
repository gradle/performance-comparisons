package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_402 {
    private final Production44_402 production = new Production44_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}