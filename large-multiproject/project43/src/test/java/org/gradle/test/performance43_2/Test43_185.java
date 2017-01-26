package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_185 {
    private final Production43_185 production = new Production43_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}