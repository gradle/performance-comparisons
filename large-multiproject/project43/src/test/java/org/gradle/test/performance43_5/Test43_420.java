package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_420 {
    private final Production43_420 production = new Production43_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}