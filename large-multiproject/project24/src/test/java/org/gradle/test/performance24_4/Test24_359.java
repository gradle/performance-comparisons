package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_359 {
    private final Production24_359 production = new Production24_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}