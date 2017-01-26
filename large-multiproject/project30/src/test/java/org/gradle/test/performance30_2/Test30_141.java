package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_141 {
    private final Production30_141 production = new Production30_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}