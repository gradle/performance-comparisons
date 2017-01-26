package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_335 {
    private final Production7_335 production = new Production7_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}