package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_284 {
    private final Production30_284 production = new Production30_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}