package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_368 {
    private final Production30_368 production = new Production30_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}