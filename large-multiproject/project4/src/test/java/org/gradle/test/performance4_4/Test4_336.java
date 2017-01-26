package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_336 {
    private final Production4_336 production = new Production4_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}