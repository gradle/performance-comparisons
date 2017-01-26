package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_420 {
    private final Production30_420 production = new Production30_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}