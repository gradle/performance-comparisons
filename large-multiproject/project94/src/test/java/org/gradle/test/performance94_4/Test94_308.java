package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_308 {
    private final Production94_308 production = new Production94_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}