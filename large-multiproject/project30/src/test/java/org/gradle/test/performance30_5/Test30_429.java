package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_429 {
    private final Production30_429 production = new Production30_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}