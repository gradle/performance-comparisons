package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_116 {
    private final Production43_116 production = new Production43_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}