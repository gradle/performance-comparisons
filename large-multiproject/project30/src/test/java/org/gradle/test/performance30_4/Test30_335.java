package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_335 {
    private final Production30_335 production = new Production30_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}