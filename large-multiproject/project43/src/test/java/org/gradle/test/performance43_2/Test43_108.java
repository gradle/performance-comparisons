package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_108 {
    private final Production43_108 production = new Production43_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}