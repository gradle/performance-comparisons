package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_381 {
    private final Production25_381 production = new Production25_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}