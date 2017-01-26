package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_25 {
    private final Production25_25 production = new Production25_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}