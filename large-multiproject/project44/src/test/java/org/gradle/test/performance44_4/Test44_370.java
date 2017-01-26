package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_370 {
    private final Production44_370 production = new Production44_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}