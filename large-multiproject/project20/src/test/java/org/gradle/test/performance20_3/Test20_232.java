package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_232 {
    private final Production20_232 production = new Production20_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}