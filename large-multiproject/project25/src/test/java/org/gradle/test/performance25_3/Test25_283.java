package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_283 {
    private final Production25_283 production = new Production25_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}