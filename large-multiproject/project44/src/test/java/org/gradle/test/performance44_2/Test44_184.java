package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_184 {
    private final Production44_184 production = new Production44_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}