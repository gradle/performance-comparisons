package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_310 {
    private final Production80_310 production = new Production80_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}