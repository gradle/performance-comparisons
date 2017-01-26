package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_443 {
    private final Production7_443 production = new Production7_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}