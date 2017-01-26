package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_142 {
    private final Production43_142 production = new Production43_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}