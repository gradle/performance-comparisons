package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_153 {
    private final Production94_153 production = new Production94_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}