package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_479 {
    private final Production43_479 production = new Production43_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}