package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_136 {
    private final Production43_136 production = new Production43_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}