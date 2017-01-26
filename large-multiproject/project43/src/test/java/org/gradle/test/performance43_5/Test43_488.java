package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_488 {
    private final Production43_488 production = new Production43_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}