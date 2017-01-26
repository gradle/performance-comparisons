package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_152 {
    private final Production43_152 production = new Production43_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}