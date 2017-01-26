package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_311 {
    private final Production20_311 production = new Production20_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}