package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_354 {
    private final Production43_354 production = new Production43_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}