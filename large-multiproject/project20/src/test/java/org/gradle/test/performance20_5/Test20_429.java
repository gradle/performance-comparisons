package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_429 {
    private final Production20_429 production = new Production20_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}