package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_217 {
    private final Production7_217 production = new Production7_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}