package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_186 {
    private final Production25_186 production = new Production25_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}