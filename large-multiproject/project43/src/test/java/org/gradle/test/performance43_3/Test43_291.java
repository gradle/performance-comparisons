package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_291 {
    private final Production43_291 production = new Production43_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}