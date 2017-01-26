package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_368 {
    private final Production7_368 production = new Production7_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}