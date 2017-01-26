package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_485 {
    private final Production44_485 production = new Production44_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}