package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_124 {
    private final Production43_124 production = new Production43_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}