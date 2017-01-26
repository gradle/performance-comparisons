package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_125 {
    private final Production43_125 production = new Production43_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}