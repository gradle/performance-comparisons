package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_480 {
    private final Production14_480 production = new Production14_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}