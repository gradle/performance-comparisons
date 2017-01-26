package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_292 {
    private final Production43_292 production = new Production43_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}