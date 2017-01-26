package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_359 {
    private final Production60_359 production = new Production60_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}