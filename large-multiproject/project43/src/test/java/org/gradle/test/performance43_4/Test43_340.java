package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_340 {
    private final Production43_340 production = new Production43_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}