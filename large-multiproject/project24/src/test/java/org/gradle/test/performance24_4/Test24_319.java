package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_319 {
    private final Production24_319 production = new Production24_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}