package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_13 {
    private final Production43_13 production = new Production43_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}