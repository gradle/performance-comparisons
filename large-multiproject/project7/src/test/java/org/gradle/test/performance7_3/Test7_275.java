package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_275 {
    private final Production7_275 production = new Production7_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}