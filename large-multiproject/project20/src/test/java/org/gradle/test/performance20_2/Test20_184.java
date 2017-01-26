package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_184 {
    private final Production20_184 production = new Production20_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}