package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_170 {
    private final Production94_170 production = new Production94_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}