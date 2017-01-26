package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_103 {
    private final Production94_103 production = new Production94_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}