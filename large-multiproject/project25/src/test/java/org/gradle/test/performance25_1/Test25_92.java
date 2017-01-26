package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_92 {
    private final Production25_92 production = new Production25_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}