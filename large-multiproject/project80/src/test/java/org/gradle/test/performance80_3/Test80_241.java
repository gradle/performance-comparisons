package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_241 {
    private final Production80_241 production = new Production80_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}