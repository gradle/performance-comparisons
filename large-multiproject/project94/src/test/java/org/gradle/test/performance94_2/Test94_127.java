package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_127 {
    private final Production94_127 production = new Production94_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}