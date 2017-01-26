package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_431 {
    private final Production25_431 production = new Production25_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}