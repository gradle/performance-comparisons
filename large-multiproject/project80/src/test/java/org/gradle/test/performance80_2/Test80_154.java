package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_154 {
    private final Production80_154 production = new Production80_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}