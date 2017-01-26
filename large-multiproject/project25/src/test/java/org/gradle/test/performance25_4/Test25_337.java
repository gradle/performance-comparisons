package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_337 {
    private final Production25_337 production = new Production25_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}