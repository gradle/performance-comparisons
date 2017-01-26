package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_391 {
    private final Production20_391 production = new Production20_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}