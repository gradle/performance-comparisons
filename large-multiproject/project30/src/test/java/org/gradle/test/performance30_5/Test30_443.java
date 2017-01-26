package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_443 {
    private final Production30_443 production = new Production30_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}