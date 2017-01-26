package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_483 {
    private final Production30_483 production = new Production30_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}