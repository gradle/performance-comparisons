package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_350 {
    private final Production25_350 production = new Production25_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}