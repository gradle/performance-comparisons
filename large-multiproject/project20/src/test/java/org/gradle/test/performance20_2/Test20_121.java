package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_121 {
    private final Production20_121 production = new Production20_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}