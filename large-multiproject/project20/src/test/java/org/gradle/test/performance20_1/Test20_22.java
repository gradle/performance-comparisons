package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_22 {
    private final Production20_22 production = new Production20_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}