package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_262 {
    private final Production60_262 production = new Production60_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}