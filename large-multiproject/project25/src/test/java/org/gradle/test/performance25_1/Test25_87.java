package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_87 {
    private final Production25_87 production = new Production25_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}