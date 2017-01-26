package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_120 {
    private final Production43_120 production = new Production43_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}