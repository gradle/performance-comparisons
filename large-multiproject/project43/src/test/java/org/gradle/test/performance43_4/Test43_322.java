package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_322 {
    private final Production43_322 production = new Production43_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}