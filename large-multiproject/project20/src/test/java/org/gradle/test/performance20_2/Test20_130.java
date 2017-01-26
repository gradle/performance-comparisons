package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_130 {
    private final Production20_130 production = new Production20_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}