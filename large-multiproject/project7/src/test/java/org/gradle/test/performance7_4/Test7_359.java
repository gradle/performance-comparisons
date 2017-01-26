package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_359 {
    private final Production7_359 production = new Production7_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}