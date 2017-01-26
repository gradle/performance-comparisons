package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_484 {
    private final Production43_484 production = new Production43_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}