package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_110 {
    private final Production43_110 production = new Production43_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}