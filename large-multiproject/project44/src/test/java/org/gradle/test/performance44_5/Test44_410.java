package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_410 {
    private final Production44_410 production = new Production44_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}