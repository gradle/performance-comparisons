package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_94 {
    private final Production43_94 production = new Production43_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}