package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_272 {
    private final Production44_272 production = new Production44_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}