package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_146 {
    private final Production43_146 production = new Production43_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}