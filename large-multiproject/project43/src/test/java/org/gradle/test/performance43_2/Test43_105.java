package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_105 {
    private final Production43_105 production = new Production43_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}