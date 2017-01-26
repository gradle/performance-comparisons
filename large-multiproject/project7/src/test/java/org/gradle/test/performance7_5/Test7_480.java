package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_480 {
    private final Production7_480 production = new Production7_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}