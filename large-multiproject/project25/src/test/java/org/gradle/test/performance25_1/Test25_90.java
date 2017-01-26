package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_90 {
    private final Production25_90 production = new Production25_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}