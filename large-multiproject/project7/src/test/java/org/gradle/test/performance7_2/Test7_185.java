package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_185 {
    private final Production7_185 production = new Production7_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}