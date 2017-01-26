package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_23 {
    private final Production43_23 production = new Production43_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}