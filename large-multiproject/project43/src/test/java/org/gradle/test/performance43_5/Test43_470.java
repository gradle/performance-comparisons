package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_470 {
    private final Production43_470 production = new Production43_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}