package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_459 {
    private final Production94_459 production = new Production94_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}