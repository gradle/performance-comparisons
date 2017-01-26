package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_188 {
    private final Production80_188 production = new Production80_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}