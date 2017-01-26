package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_365 {
    private final Production25_365 production = new Production25_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}