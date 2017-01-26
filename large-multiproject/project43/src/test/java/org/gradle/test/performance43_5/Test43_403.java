package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_403 {
    private final Production43_403 production = new Production43_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}