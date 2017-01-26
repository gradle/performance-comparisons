package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_137 {
    private final Production43_137 production = new Production43_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}