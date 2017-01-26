package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_24 {
    private final Production44_24 production = new Production44_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}