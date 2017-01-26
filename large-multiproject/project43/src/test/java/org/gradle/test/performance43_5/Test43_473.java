package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_473 {
    private final Production43_473 production = new Production43_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}