package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_335 {
    private final Production60_335 production = new Production60_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}