package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_138 {
    private final Production80_138 production = new Production80_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}