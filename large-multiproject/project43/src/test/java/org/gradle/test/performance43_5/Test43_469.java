package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_469 {
    private final Production43_469 production = new Production43_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}