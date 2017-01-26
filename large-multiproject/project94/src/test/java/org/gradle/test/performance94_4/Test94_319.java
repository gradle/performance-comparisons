package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_319 {
    private final Production94_319 production = new Production94_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}