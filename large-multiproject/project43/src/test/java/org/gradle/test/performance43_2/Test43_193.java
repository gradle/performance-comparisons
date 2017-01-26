package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_193 {
    private final Production43_193 production = new Production43_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}