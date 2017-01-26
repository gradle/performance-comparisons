package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_443 {
    private final Production44_443 production = new Production44_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}