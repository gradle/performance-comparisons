package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_301 {
    private final Production20_301 production = new Production20_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}