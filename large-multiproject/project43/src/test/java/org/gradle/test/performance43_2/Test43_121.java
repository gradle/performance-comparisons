package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_121 {
    private final Production43_121 production = new Production43_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}