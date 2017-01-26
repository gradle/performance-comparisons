package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_35 {
    private final Production25_35 production = new Production25_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}