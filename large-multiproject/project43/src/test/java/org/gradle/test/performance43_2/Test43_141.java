package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_141 {
    private final Production43_141 production = new Production43_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}