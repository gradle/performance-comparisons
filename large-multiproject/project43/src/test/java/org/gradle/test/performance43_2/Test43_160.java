package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_160 {
    private final Production43_160 production = new Production43_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}