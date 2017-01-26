package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_60 {
    private final Production80_60 production = new Production80_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}