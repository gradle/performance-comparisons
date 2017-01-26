package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_156 {
    private final Production94_156 production = new Production94_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}