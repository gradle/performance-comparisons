package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_254 {
    private final Production25_254 production = new Production25_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}