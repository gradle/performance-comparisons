package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_452 {
    private final Production94_452 production = new Production94_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}