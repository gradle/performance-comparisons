package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_464 {
    private final Production25_464 production = new Production25_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}