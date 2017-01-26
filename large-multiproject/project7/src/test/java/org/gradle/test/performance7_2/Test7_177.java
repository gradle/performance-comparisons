package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_177 {
    private final Production7_177 production = new Production7_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}