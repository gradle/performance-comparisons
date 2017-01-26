package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_243 {
    private final Production25_243 production = new Production25_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}