package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_316 {
    private final Production7_316 production = new Production7_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}