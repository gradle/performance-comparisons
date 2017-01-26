package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_455 {
    private final Production43_455 production = new Production43_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}