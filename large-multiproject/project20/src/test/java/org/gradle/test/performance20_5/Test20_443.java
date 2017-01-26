package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_443 {
    private final Production20_443 production = new Production20_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}