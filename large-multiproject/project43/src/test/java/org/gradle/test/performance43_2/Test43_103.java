package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_103 {
    private final Production43_103 production = new Production43_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}