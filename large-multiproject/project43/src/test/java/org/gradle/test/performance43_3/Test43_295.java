package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_295 {
    private final Production43_295 production = new Production43_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}