package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_489 {
    private final Production30_489 production = new Production30_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}