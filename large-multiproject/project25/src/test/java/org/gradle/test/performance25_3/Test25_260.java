package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_260 {
    private final Production25_260 production = new Production25_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}