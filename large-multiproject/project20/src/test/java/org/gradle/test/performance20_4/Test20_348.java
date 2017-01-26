package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_348 {
    private final Production20_348 production = new Production20_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}