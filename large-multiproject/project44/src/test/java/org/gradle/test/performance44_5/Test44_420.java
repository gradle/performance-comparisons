package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_420 {
    private final Production44_420 production = new Production44_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}