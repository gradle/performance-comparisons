package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_401 {
    private final Production43_401 production = new Production43_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}