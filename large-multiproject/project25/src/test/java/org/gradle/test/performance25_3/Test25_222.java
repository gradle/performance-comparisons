package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_222 {
    private final Production25_222 production = new Production25_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}