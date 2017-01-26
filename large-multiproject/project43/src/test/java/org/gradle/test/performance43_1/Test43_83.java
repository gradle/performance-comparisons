package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_83 {
    private final Production43_83 production = new Production43_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}