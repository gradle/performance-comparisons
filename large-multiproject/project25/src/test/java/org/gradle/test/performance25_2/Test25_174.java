package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_174 {
    private final Production25_174 production = new Production25_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}