package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_486 {
    private final Production43_486 production = new Production43_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}