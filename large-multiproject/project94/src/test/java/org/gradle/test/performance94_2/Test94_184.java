package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_184 {
    private final Production94_184 production = new Production94_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}