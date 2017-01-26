package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_129 {
    private final Production20_129 production = new Production20_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}