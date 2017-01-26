package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_407 {
    private final Production43_407 production = new Production43_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}