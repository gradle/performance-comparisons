package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_487 {
    private final Production7_487 production = new Production7_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}