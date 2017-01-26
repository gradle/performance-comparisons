package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_141 {
    private final Production20_141 production = new Production20_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}