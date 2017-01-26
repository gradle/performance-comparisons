package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_11 {
    private final Production30_11 production = new Production30_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}