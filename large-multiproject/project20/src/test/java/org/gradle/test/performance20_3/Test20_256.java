package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_256 {
    private final Production20_256 production = new Production20_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}