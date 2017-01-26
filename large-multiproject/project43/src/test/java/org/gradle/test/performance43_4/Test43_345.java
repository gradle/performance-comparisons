package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_345 {
    private final Production43_345 production = new Production43_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}