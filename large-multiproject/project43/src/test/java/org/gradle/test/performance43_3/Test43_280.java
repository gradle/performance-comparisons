package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_280 {
    private final Production43_280 production = new Production43_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}