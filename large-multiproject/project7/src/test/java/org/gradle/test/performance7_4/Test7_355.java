package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_355 {
    private final Production7_355 production = new Production7_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}