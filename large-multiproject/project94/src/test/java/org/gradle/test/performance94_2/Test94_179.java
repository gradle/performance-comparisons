package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_179 {
    private final Production94_179 production = new Production94_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}