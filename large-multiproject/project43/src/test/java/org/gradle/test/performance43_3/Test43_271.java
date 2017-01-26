package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_271 {
    private final Production43_271 production = new Production43_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}