package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_208 {
    private final Production20_208 production = new Production20_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}