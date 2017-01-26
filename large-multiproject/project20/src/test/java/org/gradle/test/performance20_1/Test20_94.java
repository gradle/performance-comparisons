package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_94 {
    private final Production20_94 production = new Production20_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}