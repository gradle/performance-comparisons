package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_467 {
    private final Production43_467 production = new Production43_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}