package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_341 {
    private final Production43_341 production = new Production43_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}