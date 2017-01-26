package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_124 {
    private final Production20_124 production = new Production20_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}