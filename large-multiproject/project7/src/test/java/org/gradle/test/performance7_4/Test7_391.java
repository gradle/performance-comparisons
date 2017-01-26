package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_391 {
    private final Production7_391 production = new Production7_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}