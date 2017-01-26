package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_312 {
    private final Production43_312 production = new Production43_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}