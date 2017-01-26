package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_125 {
    private final Production20_125 production = new Production20_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}