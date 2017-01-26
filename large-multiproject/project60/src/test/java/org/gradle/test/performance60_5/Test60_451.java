package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_451 {
    private final Production60_451 production = new Production60_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}