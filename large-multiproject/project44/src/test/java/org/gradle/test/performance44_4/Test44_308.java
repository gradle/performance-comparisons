package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_308 {
    private final Production44_308 production = new Production44_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}