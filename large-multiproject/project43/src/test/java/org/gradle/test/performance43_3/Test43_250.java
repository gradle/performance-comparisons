package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_250 {
    private final Production43_250 production = new Production43_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}