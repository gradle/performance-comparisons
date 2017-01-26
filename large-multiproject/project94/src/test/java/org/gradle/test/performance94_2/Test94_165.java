package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_165 {
    private final Production94_165 production = new Production94_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}