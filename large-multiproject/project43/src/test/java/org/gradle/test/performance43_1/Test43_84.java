package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_84 {
    private final Production43_84 production = new Production43_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}