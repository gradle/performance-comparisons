package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_261 {
    private final Production43_261 production = new Production43_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}