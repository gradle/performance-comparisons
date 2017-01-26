package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_268 {
    private final Production25_268 production = new Production25_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}