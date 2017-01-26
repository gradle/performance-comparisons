package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_50 {
    private final Production60_50 production = new Production60_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}