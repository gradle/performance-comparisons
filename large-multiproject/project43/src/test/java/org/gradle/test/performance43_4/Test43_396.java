package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_396 {
    private final Production43_396 production = new Production43_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}