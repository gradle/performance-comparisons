package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_370 {
    private final Production43_370 production = new Production43_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}