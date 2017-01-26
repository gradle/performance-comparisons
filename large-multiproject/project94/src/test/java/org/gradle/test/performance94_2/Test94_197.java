package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_197 {
    private final Production94_197 production = new Production94_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}