package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_156 {
    private final Production43_156 production = new Production43_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}