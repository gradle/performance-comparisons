package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_217 {
    private final Production44_217 production = new Production44_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}