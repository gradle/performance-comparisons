package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_491 {
    private final Production43_491 production = new Production43_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}