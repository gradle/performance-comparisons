package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_410 {
    private final Production30_410 production = new Production30_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}