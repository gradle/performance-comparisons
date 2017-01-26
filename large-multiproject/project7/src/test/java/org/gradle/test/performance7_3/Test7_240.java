package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_240 {
    private final Production7_240 production = new Production7_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}