package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_399 {
    private final Production30_399 production = new Production30_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}