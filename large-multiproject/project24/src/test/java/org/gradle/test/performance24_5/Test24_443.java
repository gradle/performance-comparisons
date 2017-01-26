package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_443 {
    private final Production24_443 production = new Production24_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}