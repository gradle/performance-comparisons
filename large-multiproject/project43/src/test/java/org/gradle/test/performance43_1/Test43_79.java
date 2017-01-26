package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_79 {
    private final Production43_79 production = new Production43_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}