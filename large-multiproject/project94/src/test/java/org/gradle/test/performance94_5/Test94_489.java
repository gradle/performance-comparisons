package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_489 {
    private final Production94_489 production = new Production94_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}