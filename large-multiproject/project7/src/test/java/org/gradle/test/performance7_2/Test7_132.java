package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_132 {
    private final Production7_132 production = new Production7_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}