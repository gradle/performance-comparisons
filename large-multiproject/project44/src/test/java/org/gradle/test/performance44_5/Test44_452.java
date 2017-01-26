package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_452 {
    private final Production44_452 production = new Production44_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}