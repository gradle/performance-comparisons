package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_298 {
    private final Production43_298 production = new Production43_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}