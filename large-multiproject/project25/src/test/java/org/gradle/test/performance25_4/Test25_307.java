package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_307 {
    private final Production25_307 production = new Production25_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}