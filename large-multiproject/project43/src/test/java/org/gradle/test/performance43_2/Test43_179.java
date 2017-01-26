package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_179 {
    private final Production43_179 production = new Production43_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}