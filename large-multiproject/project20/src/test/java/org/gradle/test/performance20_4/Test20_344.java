package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_344 {
    private final Production20_344 production = new Production20_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}