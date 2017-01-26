package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_344 {
    private final Production43_344 production = new Production43_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}