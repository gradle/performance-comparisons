package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_473 {
    private final Production94_473 production = new Production94_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}