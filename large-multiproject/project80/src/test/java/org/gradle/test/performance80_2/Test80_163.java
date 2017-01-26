package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_163 {
    private final Production80_163 production = new Production80_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}