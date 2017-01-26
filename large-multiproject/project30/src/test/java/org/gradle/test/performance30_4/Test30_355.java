package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_355 {
    private final Production30_355 production = new Production30_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}