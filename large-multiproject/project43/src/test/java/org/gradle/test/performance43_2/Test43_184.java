package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_184 {
    private final Production43_184 production = new Production43_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}