package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_405 {
    private final Production43_405 production = new Production43_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}