package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_400 {
    private final Production44_400 production = new Production44_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}