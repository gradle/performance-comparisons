package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_197 {
    private final Production44_197 production = new Production44_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}