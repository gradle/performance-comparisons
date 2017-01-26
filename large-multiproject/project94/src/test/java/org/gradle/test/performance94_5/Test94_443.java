package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_443 {
    private final Production94_443 production = new Production94_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}