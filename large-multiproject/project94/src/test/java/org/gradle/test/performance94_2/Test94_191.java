package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_191 {
    private final Production94_191 production = new Production94_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}