package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_174 {
    private final Production94_174 production = new Production94_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}