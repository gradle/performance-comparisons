package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_214 {
    private final Production80_214 production = new Production80_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}