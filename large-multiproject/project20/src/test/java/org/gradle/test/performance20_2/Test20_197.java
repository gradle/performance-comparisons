package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_197 {
    private final Production20_197 production = new Production20_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}