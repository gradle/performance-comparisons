package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_196 {
    private final Production80_196 production = new Production80_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}