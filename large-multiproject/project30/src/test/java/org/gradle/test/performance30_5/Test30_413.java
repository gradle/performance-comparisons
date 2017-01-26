package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_413 {
    private final Production30_413 production = new Production30_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}