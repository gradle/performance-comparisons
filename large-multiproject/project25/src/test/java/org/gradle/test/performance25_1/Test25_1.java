package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_1 {
    private final Production25_1 production = new Production25_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}