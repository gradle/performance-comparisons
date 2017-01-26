package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_423 {
    private final Production43_423 production = new Production43_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}