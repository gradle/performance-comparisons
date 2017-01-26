package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_149 {
    private final Production43_149 production = new Production43_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}