package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_284 {
    private final Production43_284 production = new Production43_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}