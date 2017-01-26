package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_59 {
    private final Production25_59 production = new Production25_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}