package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_31 {
    private final Production25_31 production = new Production25_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}