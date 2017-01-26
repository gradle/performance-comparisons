package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_129 {
    private final Production43_129 production = new Production43_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}