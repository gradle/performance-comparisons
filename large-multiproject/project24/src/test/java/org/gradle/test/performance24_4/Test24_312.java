package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_312 {
    private final Production24_312 production = new Production24_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}