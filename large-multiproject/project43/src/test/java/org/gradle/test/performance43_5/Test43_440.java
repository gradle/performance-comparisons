package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_440 {
    private final Production43_440 production = new Production43_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}