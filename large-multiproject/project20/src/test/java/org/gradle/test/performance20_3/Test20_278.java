package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_278 {
    private final Production20_278 production = new Production20_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}