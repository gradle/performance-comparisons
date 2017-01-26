package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_480 {
    private final Production44_480 production = new Production44_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}