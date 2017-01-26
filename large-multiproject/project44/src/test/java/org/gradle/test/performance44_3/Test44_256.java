package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_256 {
    private final Production44_256 production = new Production44_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}