package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_22 {
    private final Production43_22 production = new Production43_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}