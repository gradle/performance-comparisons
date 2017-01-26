package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_145 {
    private final Production25_145 production = new Production25_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}