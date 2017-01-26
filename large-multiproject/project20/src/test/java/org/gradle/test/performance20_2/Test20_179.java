package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_179 {
    private final Production20_179 production = new Production20_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}