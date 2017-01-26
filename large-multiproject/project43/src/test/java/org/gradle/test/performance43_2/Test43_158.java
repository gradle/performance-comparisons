package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_158 {
    private final Production43_158 production = new Production43_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}