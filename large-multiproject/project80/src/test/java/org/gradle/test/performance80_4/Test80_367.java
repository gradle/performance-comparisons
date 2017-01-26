package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_367 {
    private final Production80_367 production = new Production80_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}