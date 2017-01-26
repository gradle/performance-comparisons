package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_153 {
    private final Production24_153 production = new Production24_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}