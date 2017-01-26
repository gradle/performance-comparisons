package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_327 {
    private final Production60_327 production = new Production60_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}