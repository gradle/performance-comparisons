package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_170 {
    private final Production43_170 production = new Production43_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}