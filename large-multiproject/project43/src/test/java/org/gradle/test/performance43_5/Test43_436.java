package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_436 {
    private final Production43_436 production = new Production43_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}