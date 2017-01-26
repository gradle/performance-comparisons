package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_473 {
    private final Production30_473 production = new Production30_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}