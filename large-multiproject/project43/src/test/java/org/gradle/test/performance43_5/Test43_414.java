package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_414 {
    private final Production43_414 production = new Production43_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}