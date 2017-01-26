package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_287 {
    private final Production30_287 production = new Production30_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}