package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_185 {
    private final Production20_185 production = new Production20_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}