package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_54 {
    private final Production25_54 production = new Production25_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}