package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_401 {
    private final Production25_401 production = new Production25_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}