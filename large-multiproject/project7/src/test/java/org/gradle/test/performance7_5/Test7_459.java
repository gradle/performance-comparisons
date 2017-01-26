package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_459 {
    private final Production7_459 production = new Production7_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}