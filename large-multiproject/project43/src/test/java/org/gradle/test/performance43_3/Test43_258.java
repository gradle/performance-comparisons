package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_258 {
    private final Production43_258 production = new Production43_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}