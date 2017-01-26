package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_483 {
    private final Production7_483 production = new Production7_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}