package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_7 {
    private final Production80_7 production = new Production80_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}