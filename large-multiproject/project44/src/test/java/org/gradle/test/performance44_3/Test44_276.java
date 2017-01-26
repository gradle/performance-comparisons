package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_276 {
    private final Production44_276 production = new Production44_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}