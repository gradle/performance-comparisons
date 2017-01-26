package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_131 {
    private final Production25_131 production = new Production25_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}