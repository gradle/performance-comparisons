package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_470 {
    private final Production94_470 production = new Production94_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}