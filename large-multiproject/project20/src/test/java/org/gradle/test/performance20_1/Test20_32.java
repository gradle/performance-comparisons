package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_32 {
    private final Production20_32 production = new Production20_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}