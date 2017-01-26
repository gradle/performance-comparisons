package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_363 {
    private final Production44_363 production = new Production44_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}