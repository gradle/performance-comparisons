package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_101 {
    private final Production44_101 production = new Production44_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}