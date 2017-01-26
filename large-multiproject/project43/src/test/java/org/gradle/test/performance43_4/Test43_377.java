package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_377 {
    private final Production43_377 production = new Production43_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}