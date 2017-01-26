package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_5 {
    private final Production80_5 production = new Production80_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}