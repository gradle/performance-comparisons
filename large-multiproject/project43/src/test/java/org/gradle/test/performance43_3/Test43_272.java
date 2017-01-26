package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_272 {
    private final Production43_272 production = new Production43_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}