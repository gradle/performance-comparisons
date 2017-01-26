package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_130 {
    private final Production44_130 production = new Production44_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}