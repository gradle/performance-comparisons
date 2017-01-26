package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_176 {
    private final Production94_176 production = new Production94_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}