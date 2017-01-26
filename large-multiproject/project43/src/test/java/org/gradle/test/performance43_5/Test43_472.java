package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_472 {
    private final Production43_472 production = new Production43_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}