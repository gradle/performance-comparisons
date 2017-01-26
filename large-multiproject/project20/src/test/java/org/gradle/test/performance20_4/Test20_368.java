package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_368 {
    private final Production20_368 production = new Production20_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}