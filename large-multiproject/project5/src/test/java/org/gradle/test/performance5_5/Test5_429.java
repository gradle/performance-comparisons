package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_429 {
    private final Production5_429 production = new Production5_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}