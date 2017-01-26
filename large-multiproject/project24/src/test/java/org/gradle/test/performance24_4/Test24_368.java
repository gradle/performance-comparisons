package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_368 {
    private final Production24_368 production = new Production24_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}