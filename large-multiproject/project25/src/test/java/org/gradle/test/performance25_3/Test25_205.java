package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_205 {
    private final Production25_205 production = new Production25_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}