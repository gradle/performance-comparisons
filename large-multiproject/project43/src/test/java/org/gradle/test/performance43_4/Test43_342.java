package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_342 {
    private final Production43_342 production = new Production43_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}