package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_13 {
    private final Production20_13 production = new Production20_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}