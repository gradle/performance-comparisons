package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_489 {
    private final Production24_489 production = new Production24_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}