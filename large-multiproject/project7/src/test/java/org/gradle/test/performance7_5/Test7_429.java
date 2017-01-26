package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_429 {
    private final Production7_429 production = new Production7_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}