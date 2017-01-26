package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_158 {
    private final Production20_158 production = new Production20_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}