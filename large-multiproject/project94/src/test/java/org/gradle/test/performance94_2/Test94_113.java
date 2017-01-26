package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_113 {
    private final Production94_113 production = new Production94_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}