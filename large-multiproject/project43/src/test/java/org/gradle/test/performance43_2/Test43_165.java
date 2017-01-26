package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_165 {
    private final Production43_165 production = new Production43_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}