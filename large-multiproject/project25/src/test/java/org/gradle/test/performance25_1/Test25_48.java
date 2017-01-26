package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_48 {
    private final Production25_48 production = new Production25_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}